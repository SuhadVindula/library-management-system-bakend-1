import express, {json, Router} from "express";
import cors from 'cors';
import {Db, MongoClient} from "mongodb";
import env from "dotenv";


env.config();

const mongo:MongoClient=new MongoClient(process.env.APP_DB_URL!);



async function main() {
    // Use connect method to connect to the server
    await mongo.connect();
    console.log('Connected successfully to server');
    const db:Db = mongo.db(process.env.APP_DB_NAME);

}
main();


export const router: Router = express.Router();

router.use(json());
router.use(cors());

router.get('/', (req, res) =>
    res.send("<h1>Get Members</h>"));

router.post('/', (req, res) =>
    res.send("<h1>Update Members</h>")
);

router.patch('/:memberId', (req, res) =>
    res.send("<h1>Update Members</h>")
);

router.delete('/:memberId', (req, res) =>
    res.send("<h1>Delete Members</h>")
);

router.get('/', (req, res) => res.send(alert("save")));