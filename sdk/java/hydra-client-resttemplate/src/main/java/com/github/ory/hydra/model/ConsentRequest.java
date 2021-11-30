/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.github.ory.hydra.model.OAuth2Client;
import com.github.ory.hydra.model.OpenIDConnectContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-18T22:54:40.815+01:00")
public class ConsentRequest {
  @JsonProperty("acr")
  private String acr = null;

  @JsonProperty("challenge")
  private String challenge = null;

  @JsonProperty("client")
  private OAuth2Client client = null;

  @JsonProperty("login_challenge")
  private String loginChallenge = null;

  @JsonProperty("login_session_id")
  private String loginSessionId = null;

  @JsonProperty("oidc_context")
  private OpenIDConnectContext oidcContext = null;

  @JsonProperty("request_url")
  private String requestUrl = null;

  @JsonProperty("requested_access_token_audience")
  private List<String> requestedAccessTokenAudience = null;

  @JsonProperty("requested_scope")
  private List<String> requestedScope = null;

  @JsonProperty("skip")
  private Boolean skip = null;

  @JsonProperty("subject")
  private String subject = null;

  public ConsentRequest acr(String acr) {
    this.acr = acr;
    return this;
  }

   /**
   * ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
  **/
  @ApiModelProperty(value = "ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.")
  public String getAcr() {
    return acr;
  }

  public void setAcr(String acr) {
    this.acr = acr;
  }

  public ConsentRequest challenge(String challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Challenge is the identifier (\&quot;authorization challenge\&quot;) of the consent authorization request. It is used to identify the session.
   * @return challenge
  **/
  @ApiModelProperty(value = "Challenge is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.")
  public String getChallenge() {
    return challenge;
  }

  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }

  public ConsentRequest client(OAuth2Client client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public OAuth2Client getClient() {
    return client;
  }

  public void setClient(OAuth2Client client) {
    this.client = client;
  }

  public ConsentRequest loginChallenge(String loginChallenge) {
    this.loginChallenge = loginChallenge;
    return this;
  }

   /**
   * LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login &amp; consent app.
   * @return loginChallenge
  **/
  @ApiModelProperty(value = "LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.")
  public String getLoginChallenge() {
    return loginChallenge;
  }

  public void setLoginChallenge(String loginChallenge) {
    this.loginChallenge = loginChallenge;
  }

  public ConsentRequest loginSessionId(String loginSessionId) {
    this.loginSessionId = loginSessionId;
    return this;
  }

   /**
   * LoginSessionID is the authentication session ID. It is set if the browser had a valid authentication session at ORY Hydra during the login flow. It can be used to associate consecutive login requests by a certain user.
   * @return loginSessionId
  **/
  @ApiModelProperty(value = "LoginSessionID is the authentication session ID. It is set if the browser had a valid authentication session at ORY Hydra during the login flow. It can be used to associate consecutive login requests by a certain user.")
  public String getLoginSessionId() {
    return loginSessionId;
  }

  public void setLoginSessionId(String loginSessionId) {
    this.loginSessionId = loginSessionId;
  }

  public ConsentRequest oidcContext(OpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
    return this;
  }

   /**
   * Get oidcContext
   * @return oidcContext
  **/
  @ApiModelProperty(value = "")
  public OpenIDConnectContext getOidcContext() {
    return oidcContext;
  }

  public void setOidcContext(OpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
  }

  public ConsentRequest requestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
   * @return requestUrl
  **/
  @ApiModelProperty(value = "RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.")
  public String getRequestUrl() {
    return requestUrl;
  }

  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }

  public ConsentRequest requestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
    return this;
  }

  public ConsentRequest addRequestedAccessTokenAudienceItem(String requestedAccessTokenAudienceItem) {
    if (this.requestedAccessTokenAudience == null) {
      this.requestedAccessTokenAudience = new ArrayList<String>();
    }
    this.requestedAccessTokenAudience.add(requestedAccessTokenAudienceItem);
    return this;
  }

   /**
   * RequestedScope contains the access token audience as requested by the OAuth 2.0 Client.
   * @return requestedAccessTokenAudience
  **/
  @ApiModelProperty(value = "RequestedScope contains the access token audience as requested by the OAuth 2.0 Client.")
  public List<String> getRequestedAccessTokenAudience() {
    return requestedAccessTokenAudience;
  }

  public void setRequestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
  }

  public ConsentRequest requestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
    return this;
  }

  public ConsentRequest addRequestedScopeItem(String requestedScopeItem) {
    if (this.requestedScope == null) {
      this.requestedScope = new ArrayList<String>();
    }
    this.requestedScope.add(requestedScopeItem);
    return this;
  }

   /**
   * RequestedScope contains the OAuth 2.0 Scope requested by the OAuth 2.0 Client.
   * @return requestedScope
  **/
  @ApiModelProperty(value = "RequestedScope contains the OAuth 2.0 Scope requested by the OAuth 2.0 Client.")
  public List<String> getRequestedScope() {
    return requestedScope;
  }

  public void setRequestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
  }

  public ConsentRequest skip(Boolean skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
   * @return skip
  **/
  @ApiModelProperty(value = "Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.")
  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(Boolean skip) {
    this.skip = skip;
  }

  public ConsentRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
   * @return subject
  **/
  @ApiModelProperty(value = "Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.acr, consentRequest.acr) &&
        Objects.equals(this.challenge, consentRequest.challenge) &&
        Objects.equals(this.client, consentRequest.client) &&
        Objects.equals(this.loginChallenge, consentRequest.loginChallenge) &&
        Objects.equals(this.loginSessionId, consentRequest.loginSessionId) &&
        Objects.equals(this.oidcContext, consentRequest.oidcContext) &&
        Objects.equals(this.requestUrl, consentRequest.requestUrl) &&
        Objects.equals(this.requestedAccessTokenAudience, consentRequest.requestedAccessTokenAudience) &&
        Objects.equals(this.requestedScope, consentRequest.requestedScope) &&
        Objects.equals(this.skip, consentRequest.skip) &&
        Objects.equals(this.subject, consentRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, challenge, client, loginChallenge, loginSessionId, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, skip, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    loginChallenge: ").append(toIndentedString(loginChallenge)).append("\n");
    sb.append("    loginSessionId: ").append(toIndentedString(loginSessionId)).append("\n");
    sb.append("    oidcContext: ").append(toIndentedString(oidcContext)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAccessTokenAudience: ").append(toIndentedString(requestedAccessTokenAudience)).append("\n");
    sb.append("    requestedScope: ").append(toIndentedString(requestedScope)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

