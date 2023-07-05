import express, {Express} from 'express';
import env from 'dotenv';

env.config()
const app: Express = express();
app.listen(8082, () => console.log(`server has been started at ${process.env.APP_PORT}`));