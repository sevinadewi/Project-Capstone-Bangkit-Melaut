import dotenv from 'dotenv';
dotenv.config();

import {Sequelize} from "sequelize";

// const db = new Sequelize('auth_db','root','password123',{
//     host: "34.101.136.39",
//     dialect: "mysql",
    
// });

const db = new Sequelize(
    process.env.DB_NAME,
    process.env.DB_USER,
    process.env.DB_PASSWORD,
    {
        host: process.env.DB_HOST,
        dialect: 'mysql',
    }
)

export default db;