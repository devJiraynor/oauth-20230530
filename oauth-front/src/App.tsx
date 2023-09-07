import React from 'react';
import './App.css';
import { Routes, Route } from 'react-router-dom';
import Main from 'views/Main';
import Login from 'views/Login';
import Oauth from 'views/Oauth';

function App() {
  return (
    <Routes>
      <Route path='/' element={<Main />} />
      <Route path='/login' element={<Login />} />
      <Route path='/oauth2/:token' element={<Oauth />} />
    </Routes>
  );
}

export default App;
