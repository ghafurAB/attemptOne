import axios from 'axios'
import { useState,  } from 'react';
import { useHistory } from 'react-router-dom';
import '../css/create.css';

const Create = () => {
    const history = useHistory()

    const  [isbnNumber, setIsbnNumber ] = useState("")
    const  [subject, setSubject]  = useState("")
    const  [title, setTitle]  = useState("")
    const  [email, setEmail]  = useState("")
    const  [author, setAuthor]  = useState("")
    const  [description, setDescription]  = useState("")
    const  [detail, setDetail]  = useState("")

   

    const createArticle = (event) => {
        event.preventDefault()
        const newArticle = {
            isbnNumber: parseInt(isbnNumber),
            email: email,
            subject: subject,
            title: title,
            author: author,
            description: description,
            detail: detail
        }
        console.log(newArticle)
       
        
        try {
            if (window.confirm("are you sure you want to create the article " + title)) axios.post("http://localhost:8080/rest/articles", newArticle)
            history.push("/")        
        } catch (error) {
            alert("try again")
        }
}
    return (
        <div className="create">
            <form onSubmit={createArticle}>
                <input required placeholder="isbn" value={isbnNumber} type="number" name="isbnNumber" onChange={e => setIsbnNumber(e.target.value)} />
                <input required placeholder="subject" value={subject} type="text" name="subject" onChange={e => setSubject(e.target.value)} />
                <input required placeholder="title" value={title} type="text" name="title" onChange={e => setTitle(e.target.value)} />
                <input required placeholder="author" value={author} type="text" name="author" onChange={e => setAuthor(e.target.value)} />
                <input required placeholder="email" value={email} type="email" name="email" onChange={e => setEmail(e.target.value)} />
                <textarea required placeholder="description" value={description} name="description" onChange={e => setDescription(e.target.value)} />
                <textarea required placeholder="detail" value={detail} name="detail" onChange={e => setDetail(e.target.value)} />
                <button type='submit'>Create</button>
            </form>
        </div>
    );
}

export default Create;