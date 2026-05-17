package cl.duoc.backend_hotel_registro.client;
import cl.duoc.backend_hotel_registro.dto.Usuariodto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-hoteles", url = "${hoteles.service.url:http://50.16.98.226:8080}")
public interface HotelClient {

    // IMPORTANTE: Pregúntale a tu compañero cuál es la ruta exacta de su @PostMapping 
    // donde él espera recibir este JSON (ejemplo: "/api/hoteles/usuarios")
    @PostMapping("/api/hoteles/usuarios")
    void enviarClienteAHotel(@RequestBody Usuariodto dto);
}