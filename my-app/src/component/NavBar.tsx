import * as React from 'react';
import { BrowserRouter, Routes, Route} from 'react-router-dom';
import Blogs from './blogs';
import Home from './home'
import Contact from './contact';


function NavBar() {
    return(
        <BrowserRouter>
      <Routes>
          <Route index element={<Home />} />
          <Route path="blogs" element={<Blogs />} />
          <Route path="contact" element={<Contact />} />
      </Routes>
    </BrowserRouter>
    )
}

export default NavBar;