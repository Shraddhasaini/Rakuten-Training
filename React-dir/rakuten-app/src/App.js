import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';


import axios from 'axios';

import Person from './components/Person';
import Product from './components/Product';


class App extends Component {

  state = {
    personList: [{name:"Shraddha",age:18},{name:"John Doe",age:"42"},{name:"Jane Doe",age:"41"}],
    productList: []
  }

  componentDidMount(){
    axios.get("http://localhost:8080/products").then(resp => {
      this.setState({productList :resp.data});
    })
  }

  render() {
    return (
      <div className="App">
       
       <div className="ui cards">

       {
         this.state.productList.map((aProduct) => {
           return (<Product product={aProduct} />);
         })
       }
       </div>
       

      </div>
    );
  }
}

export default App;

