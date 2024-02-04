<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>AI ChatBot</title>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #5c5858;
        }

        .login-container {
            max-width: 500px;
            margin-top: 180px;
            margin-left: 450px;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        h2 {
            font-size: 24px;
            color: #2d3748;
            margin-bottom: 20px;
            text-align: center;
        }

        .chat-container {
            padding: 20px;
            background-color: #f0f7f4;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
            overflow-y: auto;
            max-height: 300px;
        }

        .message-bot {
            margin-bottom: 45px;
            display: flex;
            align-items: flex-start;
        }

        .message-bot .text {
            padding: 10px 15px;
            border-radius: 20px;
            background-color: #5fa463;
            color: #fff;
            max-width: 70%;
            word-wrap: break-word;
        }

        .input-container {
            display: flex;
            align-items: center;
            margin-top: 10px;
            justify-content: center;
        }

        .input-container label {
            font-size: 16px;
            margin-right: 10px;
            color: #2d3748;
        }

        .input-container input[type="text"] {
            flex: 1;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
            outline: none;
        }

        .input-container button {
            background-color: #5fa463;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            outline: none;
        }

        .input-container button:hover {
            background-color: #4d8c57;
        }


    </style>
</head>
<body>
<div class="login-container">
    <h2>AI ChatBot</h2>
    <div class="chat-container" id="chat-container">
        <% String botResp = (String) request.getAttribute("botResp");

        if(botResp != null) {%>
            <div class="message-bot">
                <div class="text">
                    <%= botResp %>
                </div>
            </div>
        <% }%>
    </div>
    <div class="input-container">
        <form action="show" method="post">
        <div class="cont">
            <label for="user-input">Your Message:</label>
            <input type="text" id="user-input" name="user_text" required placeholder="Enter your message...">
            <button type="submit">Send</button>
        </div>
        </form>
    </div>
</div>
</body>
</html>
