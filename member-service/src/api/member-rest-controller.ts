import express, {json, Router} from "express";
import cors from 'cors';

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