export const environment = {
    production: true,
    inDevelopment: true,
    enableEmailSendForRegistrationScreen: true,
    AUTH_SERVER_URI: "http://localhost:9000",
    API_URI: "http://localhost:8000",
    REDIRECT_URI: "http://127.0.0.1:4200/auth/authorized",

};

export const UI_PORT = 4020;
// TODO change
export const CLIENT_ID = 'angular-client';
export const CLIENT_SECRET = "secret";

// export const AUTH_SERVER_URI = "https://authorization.social-media-project.nullchefo.com";
// export const REDIRECT_URI = "https://social-media-project.nullchefo.com/auth/authorized";
// export const API_URI = "https://api.social-media-project.nullchefo.com";


// export const AUTH_SERVER_URI = "https://auth.nullchefo.com";
// export const REDIRECT_URI = "https://diploma-project.nullchefo.com/auth/authorized";
// export const API_URI = "https://backend.nullchefo.com";
export const SCOPES = "openid";
export const AUTHORIZATION_URL = environment.AUTH_SERVER_URI + "/oauth2/authorize";
export const TOKEN_ENDPOINT = environment.AUTH_SERVER_URI + "/oauth2/token";
export const REVOKE_ENDPOINT = environment.AUTH_SERVER_URI + "/oauth2/revoke";
export const INTROSPECT_TOKEN_ENDPOINT = environment.AUTH_SERVER_URI + "/oauth2/introspect";
export const USER_PATH_V1 = environment.API_URI + "/authorization/user/v1";

export const POST_ENDPOINT = environment.API_URI + "/social-media/v1/post";
export const GROUP_ENDPOINT = environment.API_URI + "/social-media/v1/group";
export const MESSAGE_ENDPOINT = environment.API_URI + "/social-media/v1/message";
export const CONNECTION_ENDPOINT = environment.API_URI + "/social-media/v1/connection";
export const MEDIA_ENDPOINT = environment.API_URI + "/social-media/v1/media";
export const FEED_ENDPOINT = environment.API_URI + "/social-media/v1/feed";
export const LIKE_ENDPOINT = environment.API_URI + "/social-media/v1/like";
export const USER_PATH_V2 = environment.API_URI + "/social-media/v2/user";


export const COMMENT_ENDPOINT = environment.API_URI + "/social-media/v1/comment";

