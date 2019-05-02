package com.revature.feign;

import org.springframework.stereotype.Component;

import feign.Response;
import feign.codec.ErrorDecoder;

/**
 * The Class FeignErrorDecoder.
 */
@Component
public class FeignErrorDecoder implements ErrorDecoder {
	
	/** The delegate. */
	private ErrorDecoder delegate = new ErrorDecoder.Default();

	/* (non-Javadoc)
	 * @see feign.codec.ErrorDecoder#decode(java.lang.String, feign.Response)
	 */
	@Override
	public Exception decode(String methodKey, Response response) {
		if (response.status() >= 400 && response.status()  <= 599) {
			return new FeignException(response.status(), response.reason());
		}
		return delegate.decode(methodKey, response);
	}
}