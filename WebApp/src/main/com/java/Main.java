package com.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Main extends HttpServlet {
    private final Random random = new Random();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String user_text = req.getParameter("user_text");
        String botResponse = processUserText(user_text);

        req.setAttribute("botResp", botResponse);
        req.getRequestDispatcher("/com/html/index.jsp").forward(req, resp);

    }

    public String processUserText(String userText) {
        switch (userText.toLowerCase()) {
            case "hey":
            case "hello":
            case "hi":
                return "Hello Sir! How are you?";
            case "bye":
            case "okbye":
            case "ok bye":
                return "Goodbye sir!";
            case "how are you?":
            case "how are you":
            case "how are you??":
                return "I am fine sir! What about you?";
            case "i am fine":
            case "i am fine bro":
            case "i am fine sir":
                return "That's great!";
            case "what's up?":
            case "sup":
            case "howdy":
                return "Not much, just here to assist you!";
            case "thank you":
            case "thanks":
                return "You're welcome!";
            case "please":
            case "kindly":
                return "Of course!";
            case "who are you?":
            case "what are you?":
                return "I am a virtual assistant designed to help you!";
            case "good morning":
                return "Good morning!";
            case "good afternoon":
                return "Good afternoon!";
            case "good evening":
                return "Good evening!";
            case "how's the weather?":
                return "The weather is sunny today!";
            case "tell me a joke":
            case "tell me joke":
            case "give me a joke":
            case "give me joke":
            case "give joke":
            case "give a joke":
                return "Joke" + getRandomJoke();
            case "tell me a quote":
            case "tell me quote":
            case "give me a quote":
            case "give me quote":
            case "give quote":
            case "give a quote":
                return "Quote" + getRandomQuote();
            case "can you help me?":
                return "Yes, I'm here to help. What do you need?";
            case "what time is it?":
                return "It's currently " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
            case "what is today's date?":
                return "Today's date is " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            // Additional cases
            case "what's your age?":
                return "I don't have an age as I am a virtual assistant!";
            case "what is the capital of France?":
                return "The capital of France is Paris!";
            case "how do I cook pasta?":
                return "Boil water, add pasta, cook until al dente, then drain and serve with your favorite sauce!";
            case "what\'s the distance between Earth and Mars?":
                return "The distance between Earth and Mars varies depending on their positions in their orbits.";
            case "what is the largest ocean?":
                return "The largest ocean is the Pacific Ocean!";
            default:
                return "Sorry, I can't understand your input.";
        }
    }
    private String getRandomQuote() {
        // Array of quotes
        String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
                "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                "It does not matter how slowly you go as long as you do not stop. - Confucius",
                "Your time is limited, don't waste it living someone else's life. - Steve Jobs",
                "The best way to predict the future is to invent it. - Alan Kay",
                "You miss 100% of the shots you don't take. - Wayne Gretzky",
                "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                "Strive not to be a success, but rather to be of value. - Albert Einstein",
                "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln",
                "Life is what happens when you're busy making other plans. - John Lennon"
        };

        // Return a random quote from the array
        return quotes[random.nextInt(quotes.length)];
    }

    private String getRandomJoke() {
        // Array of jokes
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Parallel lines have so much in common. It's a shame they'll never meet.",
                "Why don't skeletons fight each other? They don't have the guts.",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "I told my wife she was drawing her eyebrows too high. She looked surprised.",
                "What do you call cheese that isn't yours? Nacho cheese!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What did one ocean say to the other ocean? Nothing, they just waved!",
                "Why did the bicycle fall over? Because it was two-tired!",
                "I'm reading a book on anti-gravity. It's impossible to put down!",
                "Why don't eggs tell jokes? Because they'd crack each other up!",
                "I'm reading a book about anti-gravity. It's impossible to put down!",
                "I'm terrified of elevators, so I'm going to start taking steps to avoid them!",
                "I told my computer I needed a break, and now it won't stop sending me vacation ads.",
                "I'm trying to organize a hide and seek competition, but it's hard to find good players.",
                "Why did the coffee file a police report? It got mugged!",
                "I used to play piano by ear, but now I use my hands.",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why was the math book sad? Because it had too many problems.",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What did the janitor say when he jumped out of the closet? Supplies!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "What do you call fake spaghetti? An impasta!",
                "What's brown and sticky? A stick!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "What do you call a fake noodle? An impasta!",
                "What did the janitor say when he jumped out of the closet? Supplies!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why did the coffee file a police report? It got mugged!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "What's an astronaut's favorite part of a computer? The space bar!",
                "What's brown and sticky? A stick!",
                "What do you call fake spaghetti? An impasta!",
                "What do you call a fake noodle? An impasta!",
                "Why did the tomato turn red? Because it saw the salad dressing!",
                "Why did the coffee file a police report? It got mugged!",
                "What do you call a fish wearing a bowtie? SoFISHticated!",
                "Why was the math book sad? Because it had too many problems!",
                "Why don't oysters donate to charity? Because they're shellfish!",
                "Why did the golfer bring two pairs of pants? In case he got a hole in one!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the broom late? It overswept!",
                "What's orange and sounds like a parrot? A carrot"
        };
        // Return a random joke from the array
        return jokes[random.nextInt(jokes.length)];
    }
}
