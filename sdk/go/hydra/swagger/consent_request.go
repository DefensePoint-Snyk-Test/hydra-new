/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 *
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type ConsentRequest struct {

	// ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
	Acr string `json:"acr,omitempty"`

	// Challenge is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.
	Challenge string `json:"challenge,omitempty"`

	Client OAuth2Client `json:"client,omitempty"`

	// LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.
	LoginChallenge string `json:"login_challenge,omitempty"`

	// LoginSessionID is the authentication session ID. It is set if the browser had a valid authentication session at ORY Hydra during the login flow. It can be used to associate consecutive login requests by a certain user.
	LoginSessionId string `json:"login_session_id,omitempty"`

	OidcContext OpenIdConnectContext `json:"oidc_context,omitempty"`

	// RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
	RequestUrl string `json:"request_url,omitempty"`

	// RequestedScope contains the access token audience as requested by the OAuth 2.0 Client.
	RequestedAccessTokenAudience []string `json:"requested_access_token_audience,omitempty"`

	// RequestedScope contains the OAuth 2.0 Scope requested by the OAuth 2.0 Client.
	RequestedScope []string `json:"requested_scope,omitempty"`

	// Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
	Skip bool `json:"skip,omitempty"`

	// Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
	Subject string `json:"subject,omitempty"`
}