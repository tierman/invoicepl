package pl.icreatesoftware.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class InvoiceController {

    @GetMapping("/ping")
    String ping() {
        return "testRegisterInvoice";
    }
}
