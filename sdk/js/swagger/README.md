# ory_hydra

OryHydra - JavaScript client for ory_hydra
Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: latest
- Package version: latest
- Build package: io.swagger.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install ory_hydra --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your ory_hydra from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('ory_hydra')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/GIT_USER_ID/GIT_REPO_ID
then install it via:

```shell
    npm install GIT_USER_ID/GIT_REPO_ID --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var OryHydra = require('ory_hydra');

var api = new OryHydra.AdminApi()

var challenge = "challenge_example"; // {String} 

var opts = { 
  'body': new OryHydra.AcceptConsentRequest() // {AcceptConsentRequest} 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.acceptConsentRequest(challenge, opts, callback);

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OryHydra.AdminApi* | [**acceptConsentRequest**](docs/AdminApi.md#acceptConsentRequest) | **PUT** /oauth2/auth/requests/consent/{challenge}/accept | Accept an consent request
*OryHydra.AdminApi* | [**acceptLoginRequest**](docs/AdminApi.md#acceptLoginRequest) | **PUT** /oauth2/auth/requests/login/{challenge}/accept | Accept an login request
*OryHydra.AdminApi* | [**createJsonWebKeySet**](docs/AdminApi.md#createJsonWebKeySet) | **POST** /keys/{set} | Generate a new JSON Web Key
*OryHydra.AdminApi* | [**createOAuth2Client**](docs/AdminApi.md#createOAuth2Client) | **POST** /clients | Create an OAuth 2.0 client
*OryHydra.AdminApi* | [**deleteJsonWebKey**](docs/AdminApi.md#deleteJsonWebKey) | **DELETE** /keys/{set}/{kid} | Delete a JSON Web Key
*OryHydra.AdminApi* | [**deleteJsonWebKeySet**](docs/AdminApi.md#deleteJsonWebKeySet) | **DELETE** /keys/{set} | Delete a JSON Web Key Set
*OryHydra.AdminApi* | [**deleteOAuth2Client**](docs/AdminApi.md#deleteOAuth2Client) | **DELETE** /clients/{id} | Deletes an OAuth 2.0 Client
*OryHydra.AdminApi* | [**flushInactiveOAuth2Tokens**](docs/AdminApi.md#flushInactiveOAuth2Tokens) | **POST** /oauth2/flush | Flush Expired OAuth2 Access Tokens
*OryHydra.AdminApi* | [**getConsentRequest**](docs/AdminApi.md#getConsentRequest) | **GET** /oauth2/auth/requests/consent/{challenge} | Get consent request information
*OryHydra.AdminApi* | [**getJsonWebKey**](docs/AdminApi.md#getJsonWebKey) | **GET** /keys/{set}/{kid} | Fetch a JSON Web Key
*OryHydra.AdminApi* | [**getJsonWebKeySet**](docs/AdminApi.md#getJsonWebKeySet) | **GET** /keys/{set} | Retrieve a JSON Web Key Set
*OryHydra.AdminApi* | [**getLoginRequest**](docs/AdminApi.md#getLoginRequest) | **GET** /oauth2/auth/requests/login/{challenge} | Get an login request
*OryHydra.AdminApi* | [**getOAuth2Client**](docs/AdminApi.md#getOAuth2Client) | **GET** /clients/{id} | Get an OAuth 2.0 Client.
*OryHydra.AdminApi* | [**introspectOAuth2Token**](docs/AdminApi.md#introspectOAuth2Token) | **POST** /oauth2/introspect | Introspect OAuth2 tokens
*OryHydra.AdminApi* | [**listOAuth2Clients**](docs/AdminApi.md#listOAuth2Clients) | **GET** /clients | List OAuth 2.0 Clients
*OryHydra.AdminApi* | [**listUserConsentSessions**](docs/AdminApi.md#listUserConsentSessions) | **GET** /oauth2/auth/sessions/consent/{user} | Lists all consent sessions of a user
*OryHydra.AdminApi* | [**rejectConsentRequest**](docs/AdminApi.md#rejectConsentRequest) | **PUT** /oauth2/auth/requests/consent/{challenge}/reject | Reject an consent request
*OryHydra.AdminApi* | [**rejectLoginRequest**](docs/AdminApi.md#rejectLoginRequest) | **PUT** /oauth2/auth/requests/login/{challenge}/reject | Reject a login request
*OryHydra.AdminApi* | [**revokeAllUserConsentSessions**](docs/AdminApi.md#revokeAllUserConsentSessions) | **DELETE** /oauth2/auth/sessions/consent/{user} | Revokes all previous consent sessions of a user
*OryHydra.AdminApi* | [**revokeAuthenticationSession**](docs/AdminApi.md#revokeAuthenticationSession) | **DELETE** /oauth2/auth/sessions/login/{user} | Invalidates a user&#39;s authentication session
*OryHydra.AdminApi* | [**revokeUserClientConsentSessions**](docs/AdminApi.md#revokeUserClientConsentSessions) | **DELETE** /oauth2/auth/sessions/consent/{user}/{client} | Revokes consent sessions of a user for a specific OAuth 2.0 Client
*OryHydra.AdminApi* | [**revokeUserLoginCookie**](docs/AdminApi.md#revokeUserLoginCookie) | **GET** /oauth2/auth/sessions/login/revoke | Logs user out by deleting the session cookie
*OryHydra.AdminApi* | [**updateJsonWebKey**](docs/AdminApi.md#updateJsonWebKey) | **PUT** /keys/{set}/{kid} | Update a JSON Web Key
*OryHydra.AdminApi* | [**updateJsonWebKeySet**](docs/AdminApi.md#updateJsonWebKeySet) | **PUT** /keys/{set} | Update a JSON Web Key Set
*OryHydra.AdminApi* | [**updateOAuth2Client**](docs/AdminApi.md#updateOAuth2Client) | **PUT** /clients/{id} | Update an OAuth 2.0 Client
*OryHydra.HealthApi* | [**isInstanceAlive**](docs/HealthApi.md#isInstanceAlive) | **GET** /health/alive | Check alive status
*OryHydra.HealthApi* | [**isInstanceReady**](docs/HealthApi.md#isInstanceReady) | **GET** /health/ready | Check readiness status
*OryHydra.PublicApi* | [**discoverOpenIDConfiguration**](docs/PublicApi.md#discoverOpenIDConfiguration) | **GET** /.well-known/openid-configuration | OpenID Connect Discovery
*OryHydra.PublicApi* | [**oauthAuth**](docs/PublicApi.md#oauthAuth) | **GET** /oauth2/auth | The OAuth 2.0 authorize endpoint
*OryHydra.PublicApi* | [**oauthToken**](docs/PublicApi.md#oauthToken) | **POST** /oauth2/token | The OAuth 2.0 token endpoint
*OryHydra.PublicApi* | [**revokeOAuth2Token**](docs/PublicApi.md#revokeOAuth2Token) | **POST** /oauth2/revoke | Revoke OAuth2 tokens
*OryHydra.PublicApi* | [**userinfo**](docs/PublicApi.md#userinfo) | **GET** /userinfo | OpenID Connect Userinfo
*OryHydra.PublicApi* | [**wellKnown**](docs/PublicApi.md#wellKnown) | **GET** /.well-known/jwks.json | JSON Web Keys Discovery
*OryHydra.VersionApi* | [**getVersion**](docs/VersionApi.md#getVersion) | **GET** /version | Get service version


## Documentation for Models

 - [OryHydra.AcceptConsentRequest](docs/AcceptConsentRequest.md)
 - [OryHydra.AcceptLoginRequest](docs/AcceptLoginRequest.md)
 - [OryHydra.AuthenticationSession](docs/AuthenticationSession.md)
 - [OryHydra.CompletedRequest](docs/CompletedRequest.md)
 - [OryHydra.ConsentRequest](docs/ConsentRequest.md)
 - [OryHydra.ConsentRequestSession](docs/ConsentRequestSession.md)
 - [OryHydra.EmptyResponse](docs/EmptyResponse.md)
 - [OryHydra.FlushInactiveOAuth2TokensRequest](docs/FlushInactiveOAuth2TokensRequest.md)
 - [OryHydra.GenericError](docs/GenericError.md)
 - [OryHydra.HealthNotReadyStatus](docs/HealthNotReadyStatus.md)
 - [OryHydra.HealthStatus](docs/HealthStatus.md)
 - [OryHydra.JSONWebKey](docs/JSONWebKey.md)
 - [OryHydra.JSONWebKeySet](docs/JSONWebKeySet.md)
 - [OryHydra.JsonWebKeySetGeneratorRequest](docs/JsonWebKeySetGeneratorRequest.md)
 - [OryHydra.LoginRequest](docs/LoginRequest.md)
 - [OryHydra.OAuth2Client](docs/OAuth2Client.md)
 - [OryHydra.OAuth2TokenIntrospection](docs/OAuth2TokenIntrospection.md)
 - [OryHydra.OauthTokenResponse](docs/OauthTokenResponse.md)
 - [OryHydra.OpenIDConnectContext](docs/OpenIDConnectContext.md)
 - [OryHydra.PreviousConsentSession](docs/PreviousConsentSession.md)
 - [OryHydra.RejectRequest](docs/RejectRequest.md)
 - [OryHydra.SwaggerFlushInactiveAccessTokens](docs/SwaggerFlushInactiveAccessTokens.md)
 - [OryHydra.SwaggerJsonWebKeyQuery](docs/SwaggerJsonWebKeyQuery.md)
 - [OryHydra.SwaggerJwkCreateSet](docs/SwaggerJwkCreateSet.md)
 - [OryHydra.SwaggerJwkSetQuery](docs/SwaggerJwkSetQuery.md)
 - [OryHydra.SwaggerJwkUpdateSet](docs/SwaggerJwkUpdateSet.md)
 - [OryHydra.SwaggerJwkUpdateSetKey](docs/SwaggerJwkUpdateSetKey.md)
 - [OryHydra.SwaggerOAuthIntrospectionRequest](docs/SwaggerOAuthIntrospectionRequest.md)
 - [OryHydra.SwaggerRevokeOAuth2TokenParameters](docs/SwaggerRevokeOAuth2TokenParameters.md)
 - [OryHydra.UserinfoResponse](docs/UserinfoResponse.md)
 - [OryHydra.Version](docs/Version.md)
 - [OryHydra.WellKnown](docs/WellKnown.md)


## Documentation for Authorization


### basic

- **Type**: HTTP basic authentication

### oauth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /oauth2/auth
- **Scopes**: 
  - offline: A scope required when requesting refresh tokens
  - openid: Request an OpenID Connect ID Token
