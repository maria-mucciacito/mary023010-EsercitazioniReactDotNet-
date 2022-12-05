/*import { useEffect, useState, useRef, useContext } from "react";
import { Form, FormControl,Button } from "react-bootstrap";
import AuthContext from "./api/axios"
import React from "react";
import axios from "./api/axios";

const LOGIN_URL = '/auth'; 


export const Login = () => {
  const userRef = useRef();
  const errRef = useRef();
  const setAuth = useContext(AuthContext);

  const [user, setUser] = useState("");
  const [pwd, setPwd] = useState("");
  const [errMsg, setErrMsg] = useState("");
  const [success, setsuccess] = useState(false);

  useEffect(() => {
    userRef.current.focus();
  }, []);

  useEffect(() => {
    setErrMsg("");
  }, [user, pwd]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(LOGIN_URL,JSON.stringify({user,pwd}), 
        {
          headers: {'Content-Type': 'application/json' },
          withCredentials: true
        }
      )
      const accessToken = response.data.accessToken;
      const roles = response.data.roles; 
      setAuth({user,pwd,roles,accessToken})
      setUser("");
      setPwd("");
      setsuccess(true);
    } catch (err) {
        if (!err?.response) {
          setErrMsg('No Server Response');
      } else if (err.response?.status === 400) {
          setErrMsg('Missing Username or Password');
      } else if (err.response?.status === 401) {
          setErrMsg('Unauthorized');
      } else {
          setErrMsg('Login Failed');
      }
      errRef.current.focus();
      }
    
  };

  return (
    <>
      {success ? (
        <section>
          <h1>You are logged in</h1>
        </section>
      ) : (
        <section>
          <p>{errMsg}</p>
          <Form onSubmit={handleSubmit}>
            <Form.Group className="mb-3">
              <Form.Label>Username: </Form.Label>
              <Form.Control
                type="text"
                placeholder="Enter username"
                id="username"
                ref={userRef}
                onChange={(e) => setUser(e.target.value)}
                value={user}
                required="true"
              />
            </Form.Group>
            <Form.Group className="mb-3">
              <Form.Label>Password: </Form.Label>
              <Form.Control
                type="password"
                placeholder="Enter password"
                id="password"
                onChange={(e) => setPwd(e.target.value)}
                value={pwd}
                required="true"
              />
            </Form.Group>
            <Button variant="primary" type="submit">Sign in</Button>
          </Form>
        </section>
      )}
    </>
  );
};*/
