import React from "react";
import { Card } from "react-bootstrap";

export const SingleContact = () => {
  return (
    <>
      <Card>
        <Card.Header>Contact: </Card.Header>
        <Card.Body>
          <blockquote className="blockquote mb-0">
            <p>
              Firs Name: <br></br>
              Last Name: <br></br>
            </p>
          </blockquote>
        </Card.Body>
      </Card>
      Activiies List
      <Card>
        <Card.Header>Activity: </Card.Header>
        <Card.Body>
          <Card.Text>
            With supporting text below as a natural lead-in to additional
            content.
          </Card.Text>
        </Card.Body>
        <Card.Footer className="text-muted">2 days ago</Card.Footer>
      </Card>
    </>
  );
};
