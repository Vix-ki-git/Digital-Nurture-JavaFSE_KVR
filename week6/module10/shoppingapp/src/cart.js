import React from 'react';

export class Cart extends React.Component {
    render() {
        return (
          <table>
            <thead>
              <tr>
                <th>itemname</th>
                <th>price</th>
              </tr>
            </thead>
            <tbody>
              {this.props.items.map((item, index) => (
                <tr key={index}>
                  <td>{item.itemname}</td>
                  <td>{item.price}</td>
                </tr>
              ))}
            </tbody>
          </table>
        );
      }
}