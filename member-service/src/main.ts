import express, {Express} from 'express';
import env from 'dotenv';
import {router as MemberRouter} from  './api/member-rest-controller'

env.config()
const app: Express = express();

app.use("/api/v1/members",MemberRouter);
app.listen(8082, () => console.log(`server has been started at ${process.env.APP_PORT}`));