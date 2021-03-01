import React, {Component} from 'react';


class Product extends Component{

    render(){
        return (
            <div className="ui card">
                <div className="image">
                    <img src="https://picsum.photos/10/10" />
                </div>
                <div className="content">
                    <a className="header">{this.props.product.name}</a>
                    <div className="meta">
                    <span className="date">Qty Available : {this.props.product.qoh}</span>
                    </div>
                    <div className="description">
                    Rs. {this.props.product.price}
                    </div>
                </div>
                <div className="extra content">
                    <a>
                    <i className="user icon"></i>
                    Buy Now!!!
                    </a>
                </div>
            </div>
        );
    }
}

export default Product;