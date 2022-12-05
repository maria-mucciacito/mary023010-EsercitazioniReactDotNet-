import React from "react";
import Container from "react-bootstrap/Container";
import Navbar from "react-bootstrap/Navbar";
import "./Dashboard.css";
import { Nav, NavDropdown, Dropdown } from "react-bootstrap";
import logo from "./images/logo.png";

export const Dashboard = () => {
  return (
    <>
      <Navbar className="navbar">
        <Container className="m-3">
          <Navbar.Brand href="#home" className="text-white">
            PipeNetwork L.T.D.
          </Navbar.Brand>
          <Navbar.Toggle />
          <Navbar.Collapse className="justify-content-end">
            <Navbar.Text className="text-white m-0">
              Signed in as: Utent847329
            </Navbar.Text>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <div className="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark sidebar">
        <ul className="nav nav-pills flex-column mb-auto">
          <li className="nav-item">
            <a href="#" className="nav-link active">
              Home
            </a>
          </li>
          <li>
            <a href="#" className="nav-link text-white">
              Dashboard
            </a>
          </li>
          <li>
            <a href="#" className="nav-link text-white">
              Orders
            </a>
          </li>
          <li>
            <a href="#" className="nav-link text-white">
              Products
            </a>
          </li>
        </ul>
        <hr></hr>
        <Dropdown>
          <Dropdown.Toggle variant="dark">Utent76243</Dropdown.Toggle>
          <Dropdown.Menu>
            <Dropdown.Item href="#">Profile</Dropdown.Item>
            <Dropdown.Item href="#">Logout</Dropdown.Item>
          </Dropdown.Menu>
        </Dropdown>
      </div>
    </>
  );
};
