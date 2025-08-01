import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(response => response.json()) 
        .then(data => {
            const postList = data.map(post => new Post(post.id, post.title, post.body));
            this.setState({
                posts: postList
            });
        })
        .catch(error => {
            console.error(error);
        })
    }

    componentDidMount() {
        this.loadPosts();
    }

    

    render() {
        return (
            <div>
              <h2>Posts</h2>
              {this.state.posts.map(post => (
                <div key={post.id}>
                  <h3>{post.title}</h3>
                  <p>{post.body}</p>
                </div>
              ))}
            </div>
          );
    }

    componentDidCatch(error, info) {
        console.error(error, info);
        alert('An error occurred.');
    }


}

export default Posts;