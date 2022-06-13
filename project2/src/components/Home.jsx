import axios from 'axios'
import { useState, useEffect } from 'react';
import '../css/articleList.css';



const Home = () => {
    const [articles, setArticles] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/rest/articles")
            .then((response) => {

                const articlesData = response.data;
                setArticles([...articlesData])
            })
    })
//kalla på API för att radera
    const deleteArticleById = (id) => {
        try {
            if(window.confirm("are you sure you want to delete")) axios.delete(`http://localhost:8080/rest/articles/article/${id}`)
        } catch (error) {
            alert("try again")
        }
    }

    return (

  

//loopa igenom alla artiklar i listan
        <div className="home">
            
            {
                articles.map((article) => (
                    <div class="mainContent" key={article.id}>
                        <a>id: {article.id}</a>
                        <a>isbnNumber: {article.isbnNumber}</a>
                        <a>subject: {article.subject}</a>
                        <a>title: {article.title}</a>
                        <a>author: {article.author}</a>
                        <a>email: {article.email}</a>
                        <a>descpition: {article.description}</a>
                        <a>detail: {article.detail}</a>
                        <button class="deleteButton" onClick={() => deleteArticleById(article.id)}>Delete</button>
                    </div>
                ))
            }          
                        
                     
                    </div>
                
    )
}

            export default Home;