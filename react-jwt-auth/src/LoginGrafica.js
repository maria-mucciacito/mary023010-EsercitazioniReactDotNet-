import React, { useState } from "react";
import { Container, Form, Button } from "react-bootstrap";
import axios from "./api/axios";
import logo from "./images/logo.png";
import "./LoginGrafica.css";

export const LoginGrafica = () => {
  const [username,setUsername] = useState('');
  const [password,setPassword] = useState('');

  const handleUsername = (e) =>{
    setUsername(e.target.value)
  }
  const handlePassword = (e) =>{
    setPassword(e.target.value)
  }

  const handleApi = () =>{
    axios.post('http://localhost:4567/users/control',{
      username: username,
      password: password
    }).then(result =>{
      console.log(result)
    }).catch(error=>{
      console.log(error)
    })
  }

  return (
    <Container className="h-100 d-flex justify-content-center" id="main-container">
      <Form className="text-center w-100" id="sign-in-form">
        <img className="mb-4" src={logo} alt="logo azienda"></img>
        <h3 className="fs-3 fw-normal mb-3">Sign In</h3>
        <Form.Group controlId="sign-in-username">
          <Form.Control
            type="text"
            size="md"
            className="position-relative"
            placeholder="Username"
            name="username"
            value={username}
            onChange={handleUsername}
          />
        </Form.Group>
        <Form.Group controlId="sign-in-password">
          <Form.Control
            type="password"
            className="position-relative"
            size="md"
            placeholder="Password"
            name="password"
            value={password}
            onChange={handlePassword}
          />
        </Form.Group>
        <div className="d-grid">
          <Button variant="info" className="mt-4" size="md" onClick={handleApi}>
            Sign in
          </Button>
        </div>
      </Form>
    </Container>
  );
};
