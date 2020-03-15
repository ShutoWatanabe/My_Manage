package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;

@Controller
public class MainController {

	@Autowired
	private OAuthConsumer consumer;

	@Autowired
	OAuthProvider provider;

	@RequestMapping("/")
	public String index() throws Exception {
		// îFèÿópURLê∂ê¨
		String URL = provider.retrieveRequestToken(consumer, "http://localhost:8080/authenticated");
		return "redirect:" + URL;
	}

	@RequestMapping("/authenticated")
	public String authenticated(@RequestParam(value = "oauth_token") String oauthToken,
			@RequestParam(value = "oauth_verifier") String oauthVerifier, Model model) throws Exception {

		// accessTokenÇ∆accessTokenSecretÇê∂ê¨Ç∑ÇÈ
		provider.retrieveAccessToken(consumer, oauthVerifier);

		return "index";
	}

}
