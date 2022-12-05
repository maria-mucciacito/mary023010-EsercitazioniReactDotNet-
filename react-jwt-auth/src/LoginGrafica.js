import React from "react";
import { Container, Form, Button } from "react-bootstrap";
import logo from "./images/logo.png";
import "./LoginGrafica.css";

export const LoginGrafica = () => {
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
          />
        </Form.Group>
        <Form.Group controlId="sign-in-password">
          <Form.Control
            type="password"
            className="position-relative"
            size="md"
            placeholder="Password"
          />
        </Form.Group>
        <div className="d-grid">
          <Button variant="info" className="mt-4" type="submit" size="md">
            Sign in
          </Button>
        </div>
      </Form>
    </Container>
  );
};
