package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Data
@Getter
public class OAuthProperty {

	private String consumerKey = "8b52211d8c634271efa666e8b8a53b6f6be38715";

	private String consumerSecret = "87781fd4cb7517c6f35369a15f6a5e18bf83425e";

	private String requestTokenUrl = "https://api.zaim.net/v2/auth/request";

	private String authorizeUrl = "https://auth.zaim.net/users/auth";

	private String accessTokenUrl = "https://api.zaim.net/v2/auth/access";

	public String getConsumerKey() {
		return consumerKey;
	}

	public void setConsumerKey(String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getRequestTokenUrl() {
		return requestTokenUrl;
	}

	public void setRequestTokenUrl(String requestTokenUrl) {
		this.requestTokenUrl = requestTokenUrl;
	}

	public String getAuthorizeUrl() {
		return authorizeUrl;
	}

	public void setAuthorizeUrl(String authorizeUrl) {
		this.authorizeUrl = authorizeUrl;
	}

	public String getAccessTokenUrl() {
		return accessTokenUrl;
	}

	public void setAccessTokenUrl(String accessTokenUrl) {
		this.accessTokenUrl = accessTokenUrl;
	}

}