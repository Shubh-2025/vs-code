import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import Practice from './P.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <>
      <App/>
      <Practice/>
    </>
  </StrictMode>
)
