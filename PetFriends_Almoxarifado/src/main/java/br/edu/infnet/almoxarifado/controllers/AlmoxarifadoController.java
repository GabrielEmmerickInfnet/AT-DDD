package br.edu.infnet.almoxarifado.controllers;

import br.edu.infnet.almoxarifado.domain.Pedido;
import br.edu.infnet.almoxarifado.service.AlmoxarifadoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/almoxarifado")
public class AlmoxarifadoController {

    @Autowired
    private AlmoxarifadoService almoxarifadoService;

    @Operation(summary = "Receber Pedido", description = "Recebe um pedido e processa o ajuste de estoque")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pedido recebido com sucesso"),
        @ApiResponse(responseCode = "400", description = "Pedido inválido")
    })
    @PostMapping("/receber-pedido")
    public Pedido receberPedido(
        @Parameter(description = "Pedido recebido para ajuste de estoque", required = true)
        @RequestBody Pedido pedido) {
        return almoxarifadoService.processarPedido(pedido);
    }
}
