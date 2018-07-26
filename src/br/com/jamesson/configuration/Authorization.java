package br.com.jamesson.configuration;

import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;

public class Authorization {

	public Boolean AuthorizationBasic(HttpServletRequest httpRequest) {
		final String authorization = httpRequest.getHeader("Authorization");
		if (authorization != null && authorization.startsWith("Basic")) {
			String base64Credentials = authorization.substring("Basic".length()).trim();
			String credentials = new String(new Base64().decode(base64Credentials), Charset.forName("UTF-8"));
			final String[] values = credentials.split(":", 2);
			if (values[0].equals("jamesson") && values[1].equals("sena")) {
				return true;
			}

		}
		return false;
	}
}
