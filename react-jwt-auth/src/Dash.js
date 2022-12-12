import React from "react";
import { Navbar } from "react-bootstrap";
import { Dropdown, Container, Button } from "react-bootstrap";
import { useState } from "react";
import { Offcanvas } from "react-bootstrap";
import "./Dash.css";
import { Contact } from "./Contact";
import { SingleContact } from "./SingleContact";

export const Dash = () => {
  const [show, setShow] = useState(false);
  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  return (
    <>
      <Navbar bg="light" expand="lg">
        <Container fluid>
          <Navbar.Brand href="#" className="text-white">
            PipeNetwork L.T.D.
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="navbarScroll" />
          <Navbar.Collapse className="justify-content-end">
            <Dropdown>
              <Dropdown.Toggle variant="dark">Utent76243</Dropdown.Toggle>
              <Dropdown.Menu>
                <Dropdown.Item href="#">Profile</Dropdown.Item>
                <Dropdown.Item href="#">Logout</Dropdown.Item>
              </Dropdown.Menu>
            </Dropdown>
          </Navbar.Collapse>
        </Container>
      </Navbar>
        <div className="container-fluid">
            <div className="row">
                <div className="col-2 min-vh-100 bg-dark">
                    <ul>
                        <li>
                            <a className="nav-link px-2"><span className="ms-1 d-none d-sm-inline">Dashboard</span></a>
                        </li>
                        <li>
                            <a className="nav-link px-2"><span className="ms-1 d-none d-sm-inline">Contact</span></a>
                        </li>
                        
                    </ul>
                </div>
                <div className="col m-4"><SingleContact/></div>
            </div>
        </div>

    </>
  );
};
