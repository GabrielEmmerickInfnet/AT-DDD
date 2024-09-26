package br.edu.infnet.controllers;

import br.edu.infnet.pedidos.domain.Pedido;
import br.edu.infnet.pedidos.infra.service.PedidoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @Operation(summary = "Obter pedido por ID", description = "Busca um pedido pelo seu identificador único")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pedido encontrado"),
        @ApiResponse(responseCode = "404", description = "Pedido não encontrado")
    })
    @GetMapping("/{id}")
    public Pedido obterPorId(
        @Parameter(description = "ID do pedido a ser buscado", required = true) 
        @PathVariable(value = "id") long id) {
        return service.obterPorId(id);
    }

    @Operation(summary = "Fechar Pedido", description = "Altera o status de um pedido para 'Fechado'")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pedido fechado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Pedido não encontrado")
    })
    @PatchMapping("/fechar-pedido/{id}")
    public Pedido fecharPedido(
        @Parameter(description = "ID do pedido a ser fechado", required = true) 
        @PathVariable(value = "id") long id) {
        return service.fecharPedido(id);
    }
}
