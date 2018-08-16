package com.julio.cursomc;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julio.cursomc.services.LocalizacaoEmpreendimentoService;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		LocalizacaoEmpreendimentoService le = new LocalizacaoEmpreendimentoService();
		try {
			le.obterLatitudeLongitudeAPIGoogle();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {

		

	}
}
