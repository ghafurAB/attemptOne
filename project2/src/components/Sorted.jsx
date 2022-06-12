import axios from 'axios'
import { useState, useEffect } from 'react';
import '../css/articleList.css';

const Sorted = () => {
    const [articles, setArticles] = useState([]);
    const [searchTerm, setSearchTerm] = useState('');
    useEffect(() => {
        axios.get(`http://localhost:8080/rest/articles/isbn/${searchTerm}`)
            .then((response) => {

                const articlesData = response.data;
                setArticles([...articlesData])
            })
    })






    return (
        <div className="sorted">

            <input placeholder="search with isbn" value={searchTerm} type="number" name="searchTerm" onChange={e => setSearchTerm(e.target.value)} />

            {
                articles.map((article) => (
                    <div className="mainContent" key={article.id}>
                        <a>id: {article.id}</a>
                        <a>isbn: {article.isbn}</a>
                        <a>subject: {article.subject}</a>
                        <a>title: {article.title}</a>
                        <a>author: {article.author}</a>
                        <a>email: {article.email}</a>
                        <a>descpition: {article.description}</a>
                        <a>detail: {article.detail}</a>
                    </div>
                ))
            }
        </div>
    );
}

export default Sorted;