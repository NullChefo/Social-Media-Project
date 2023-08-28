import {environment} from "src/environments/environment";

const register = () => {
  return `${environment.AUTH_SERVER_URI}/register`;
}
export default register;
