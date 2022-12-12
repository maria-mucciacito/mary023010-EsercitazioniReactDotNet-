import React from "react";
import { Table, Button } from "react-bootstrap";

export const Contact = () => {
  return (
    <>
      <h2 className="m-3">Contacts List <Button variant="primary" size="sm" className="ms-5"> + Add </Button></h2>

      <Table>
        <thead>
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody></tbody>
      </Table>
    </>
  );
};
