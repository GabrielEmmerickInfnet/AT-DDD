package br.edu.infnet.transporte.controllers;

import br.edu.infnet.transporte.domain.Pedido;
import br.edu.infnet.transporte.service.TransporteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

    @Autowired
    private TransporteService transporteService;

    @Operation(summary = "Receber Pedido para Entrega", description = "Recebe um pedido e processa a entrega do pedido")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Pedido recebido e entregue com sucesso"),
        @ApiResponse(responseCode = "400", description = "Pedido inválido")
    })
    @PostMapping("/receber-pedido")
    public Pedido receberPedido(
        @Parameter(description = "Pedido recebido para entrega", required = true)
        @RequestBody Pedido pedido) {
        return transporteService.processarEntrega(pedido);
    }
}
