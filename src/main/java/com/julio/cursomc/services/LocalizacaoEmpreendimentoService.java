package com.julio.cursomc.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.julio.cursomc.entity.LocalizacaoAPIGoogle;


@Service
public class LocalizacaoEmpreendimentoService {

/*	@Autowired
	FornecedorService fornecedorService;
	
	@Autowired
	ConcessionariaService concessionariaService;*/
	
//	private static final Logger log = LogManager.getLogger();
	
	public void obterLatitudeLongitudeAPIGoogle() throws IOException {
		LocalizacaoAPIGoogle rag;
		
		System.out.println("entrou aqui");
		
		String endpoint = "https://maps.googleapis.com/maps/api/geocode/json?address=rua+monte+branco+458+Belo+Horizonte,+Minas+Gerais+View,+CA&key=AIzaSyCXysOXda6bwx8_LXQV6fJiftaQGI4FtKk";
		URL url = new URL(endpoint);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		con.setRequestMethod("GET");
		con.setDoInput(true);
		con.setDoOutput(true);
		con.getRequestProperties();
		
		OutputStreamWriter wr = null;
		wr = new OutputStreamWriter(con.getOutputStream());
		wr.flush();
		
		int responseCode = con.getResponseCode();
		
		if(responseCode == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
			String stringjson = "";
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				stringjson += line;
			}
			
			
			ObjectMapper objectMapper = new ObjectMapper();
			rag = objectMapper.readValue(stringjson, LocalizacaoAPIGoogle.class);
			System.out.println(rag.getResults().get(0).getGeometry().getLocation().getLat());
			System.out.println(rag.getResults().get(0).getGeometry().getLocation().getLng());
			con.disconnect();
		}
	}

	/*private LocalizacaoAPIGoogle mapJSONStringToEstabelecimentoEntity(String stringjson) throws JsonParseException, JsonMappingException, IOException {
		SimpleModule module =
		        new SimpleModule("EstabelecimentoDeserializer", new Version(3, 1, 8, null, null, null));
		module.addDeserializer(LocalizacaoAPIGoogle.class, new EstabelecimentoDeserializer(LocalizacaoAPIGoogle.class));

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(module);

		LocalizacaoAPIGoogle estab = mapper.readValue(stringjson, LocalizacaoAPIGoogle.class);
		
		return estab;
	}*/
	
	/*private String enderecoConcatenado(EstabelecimentoEntity estabelecimentoEntity) {
		String enderecoConcatenado = "";
		enderecoConcatenado += estabelecimentoEntity.dsLogradouro.replace(" ", "+");
		enderecoConcatenado += "+" + estabelecimentoEntity.dsCidade.replace(" ", "+");
		enderecoConcatenado += ",+" + estabelecimentoEntity.dsEstado.replace(" ", "+");
		
		return enderecoConcatenado;
	}*/
	
	/*public Titulo obtemDadosTitulo(String linhaDigitavel, boolean codigoPuro) {
		
		Titulo titulo = obterTitulo(linhaDigitavel, codigoPuro);
		
		if (titulo.isValido()) {
			if (titulo.getType() == TituloType.BOLETO) {
				Boleto boleto = (Boleto) titulo;
				log.info("boleto banco " + boleto.getCodigoBanco());
				
				List<BancosBean> bancos = fornecedorService.findBancos(boleto.getCodigoBanco());
				
				log.info("bancos " + bancos);
				if (!bancos.isEmpty()) {
					boleto.setBanco(bancos.get(0).getNmBanco());
					titulo.setBancoCedente(bancos.get(0).getNmBanco());
					titulo.setCodigoBanco(bancos.get(0).getCdExternoBanco());
				}
			}else if (titulo.getType() == TituloType.CONTA_CONSUMO) {
				ContaConsumo contaConsumo = (ContaConsumo) titulo;
				Integer empresa = getIntValueOfEmpresa(contaConsumo);
				ConcessionariaBean concessionariaBean = concessionariaService.findConcessionaria(empresa);
				contaConsumo.setConcessionaria(concessionariaBean.getNome());
			}
		}
		
		return titulo;
	}

	public Titulo obterTitulo(String linhaDigitavel, boolean codigoPuro) {
		return TituloFactory.getTitulo(linhaDigitavel, codigoPuro);
	}
	
	public int getIntValueOfEmpresa(ContaConsumo contaConsumo) {
		return Integer.parseInt(contaConsumo.getEmpresa());
	}*/

}
