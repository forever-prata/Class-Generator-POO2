package generators;

import java.io.IOException;

import jsonRead.JsonReader;
/**
 * Classe responsavel pela criacao de um PythonGenerator
 */
public class PythonGeneratorFactory extends GeneratorFactory{
	/**
	 * Metodo para criar um PythonGeneratorFactory
	 * 
	 * @param caminhoArquivo String que contem o caminho do arquivo json de entrada
	 */
	@Override
    public Generator createGenerator(String caminhoArquivo) throws IOException {
    	JsonReader l = new JsonReader();
    	String json = l.readFile(caminhoArquivo);
        return new PythonGenerator(json);
    }
}
