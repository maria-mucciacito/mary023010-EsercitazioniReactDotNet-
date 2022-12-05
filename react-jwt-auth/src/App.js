import pipenetwork from "./images/logo.png";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import { Button, Form, Container } from "react-bootstrap";
import React from "react";
import { Login } from "./Login";
import { LoginGrafica } from "./LoginGrafica";
import {
  MDBBtn,
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBIcon,
  MDBInput,
} from "mdb-react-ui-kit";
import {Routes,Route} from 'react-router-dom';
import { Dashboard } from "./Dashboard";


function App() {
  return (
    <>
    <Routes>
      <Route path="/dash" element={<Dashboard />}></Route>
      <Route path="/login" element={<LoginGrafica />}></Route>
    </Routes>
    </>
    
  );
}

export default App;

/*     <Form className="text-center w-100">
        <img src={pipenetwork} className="Pipe-logo mb-4" alt="Logo"></img>
        <h1 className="mb-3">Please sign in</h1>
        <Form.Group>
          <Form.Control type="text" size="lg" placeholder="Username" className="position-relative"></Form.Control>
        </Form.Group>
        <Form.Group>
          <Form.Control type="password" size="lg" placeholder="Password" className="position-relative"></Form.Control>
        </Form.Group>
        <div className="d-grid">
          <Button variant="primary" size="lg">Sign in</Button>
        </div>
      </Form>
      
      
          <MDBContainer fluid>
      <MDBRow>
        <MDBCol sm="6">
          <div className="d-flex flex-row ps-5 pt-5">
            <MDBIcon fas icon="crow fa-3x me-3" style={{ color: "#709085" }} />
            <span className="h1 fw-bold">Logo</span>
          </div>

          <div className="d-flex flex-column justify-content-center h-custom-2 w-75 pt-4">
            <h3
              className="fw-normal mb-3 ps-5 pb-3"
              style={{ letterSpacing: "1px" }}
            >
              Log in
            </h3>

            <MDBInput
              wrapperClass="mb-4 mx-5 w-100"
              label="Email address"
              id="formControlLg"
              type="email"
              size="lg"
            />
            <MDBInput
              wrapperClass="mb-4 mx-5 w-100"
              label="Password"
              id="formControlLg"
              type="password"
              size="lg"
            />

            <MDBBtn className="mb-4 px-5 mx-5 w-100" color="info" size="lg">
              Login
            </MDBBtn>
          </div>
        </MDBCol>

        <MDBCol sm="6" className="d-none d-sm-block px-0">
          <img
            src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img3.webp"
            alt="Login image"
            className="w-100"
            style={{ objectFit: "cover", objectPosition: "left" }}
          />
        </MDBCol>
      </MDBRow>
    </MDBContainer>*/
