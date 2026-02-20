# 🧠 React Quiz Application (Custom CSS)

A beautiful, fully-featured quiz application built with React, Redux, React Router, and **custom CSS styling** (no CSS frameworks). Features include question navigation, countdown timer using custom hooks, Redux state management for scores, and a detailed results page with stunning animations.

## ✨ Features

- **Custom CSS Styling**: Beautiful gradients, animations, and responsive design - all with pure CSS!
- **Question Component**: Interactive multiple-choice questions with visual feedback
- **Timer Hook**: Custom `useTimer` hook with 15-second countdown per question
- **Redux State Management**: Score and answers stored in Redux store
- **React Router**: Smooth navigation between questions and results page
- **Responsive Design**: Mobile-friendly layout that works on all screen sizes
- **Instant Feedback**: Color-coded correct/incorrect answers with smooth animations
- **Detailed Results**: Complete answer review with grades, statistics, and visual indicators
- **Auto-Navigation**: Automatically advances to next question after answering
- **Smooth Animations**: Fade-ins, slide-ins, and hover effects

## 🎨 CSS Features

- **Gradient Backgrounds**: Eye-catching purple gradient throughout
- **CSS Animations**: Fade-in, slide-in, and pulse animations
- **Hover Effects**: Interactive buttons with transform and shadow effects
- **Responsive Grid**: Flexible layouts that adapt to screen size
- **Custom Scrollbar**: Styled scrollbar for better aesthetics
- **Color-Coded Feedback**: Green for correct, red for incorrect answers
- **Progress Bar**: Visual indicator of quiz progress

## 🚀 Getting Started

### Prerequisites

- Node.js (v14 or higher)
- npm or yarn

### Installation

1. Extract the zip file
2. Navigate to the project directory:
   ```bash
   cd react-quiz-app-css
   ```

3. Install dependencies:
   ```bash
   npm install
   ```

4. Start the development server:
   ```bash
   npm start
   ```

5. Open [http://localhost:3000](http://localhost:3000) to view it in your browser

## 📁 Project Structure

```
react-quiz-app-css/
├── public/
│   └── index.html
├── src/
│   ├── components/
│   │   ├── Home.js          # Welcome/landing page
│   │   ├── Question.js      # Question component with timer
│   │   └── Results.js       # Results page with review
│   ├── redux/
│   │   ├── store.js         # Redux store configuration
│   │   └── quizSlice.js     # Redux slice for quiz state
│   ├── hooks/
│   │   └── useTimer.js      # Custom timer hook
│   ├── data/
│   │   └── questions.js     # Quiz questions data
│   ├── styles/              # 🎨 Custom CSS files
│   │   ├── Home.css         # Home page styles
│   │   ├── Question.css     # Question page styles
│   │   └── Results.css      # Results page styles
│   ├── App.js               # Main app with routing
│   ├── App.css              # Global app styles
│   ├── index.js
│   └── index.css            # Base styles
├── package.json
└── README.md
```

## 🎯 How It Works

### Redux State Management
- **Score**: Total points earned (10 points per correct answer)
- **Answers**: Array of all user answers with correctness info
- **Current Question Index**: Tracks progress through questions

### Custom Timer Hook
The `useTimer` hook manages:
- Countdown timer for each question (15 seconds)
- Auto-submit when time expires
- Pause functionality when answer is submitted
- Reset for next question
- Visual warning when time is running low

### Routing
- `/` - Home page with quiz information
- `/question/:questionIndex` - Question pages (0-9)
- `/results` - Results and detailed answer review page

### CSS Architecture
Each component has its own CSS file with:
- Component-specific classes (BEM-like naming)
- Responsive breakpoints for mobile devices
- Smooth transitions and animations
- Reusable color schemes

## 🎨 Customization

### Changing Colors
Edit the CSS files to change colors:

**Gradient Background** (in Home.css, Question.css, Results.css):
```css
background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
```

**Primary Colors**:
- Purple: `#667eea`, `#764ba2`
- Green (correct): `#48bb78`
- Red (incorrect): `#f56565`

### Adding Questions
Edit `src/data/questions.js`:

```javascript
{
  id: 11,
  question: "Your question here?",
  options: ["Option A", "Option B", "Option C", "Option D"],
  correctAnswer: 0, // Index of correct option (0-3)
  timeLimit: 15 // Seconds
}
```

### Changing Timer Duration
Modify the `timeLimit` property in each question object.

### Modifying Animations
Edit the `@keyframes` in the CSS files:
- `fadeInUp` - Vertical fade-in animation
- `slideIn` - Horizontal slide animation
- `pulse` - Pulsing opacity effect

## 📦 Available Scripts

- `npm start` - Run development server on http://localhost:3000
- `npm build` - Build optimized production bundle
- `npm test` - Run test suite
- `npm eject` - Eject from Create React App (one-way operation)

## 🛠️ Technologies Used

- **React 18** - UI library
- **Redux Toolkit** - State management made easy
- **React Router 6** - Client-side routing
- **React Hooks** - useState, useEffect, custom hooks
- **Custom CSS** - No frameworks, pure CSS styling
- **Create React App** - Build tooling

## 📱 Responsive Design

The app is fully responsive with breakpoints at:
- Mobile: < 768px
- Tablet/Desktop: ≥ 768px

All layouts adapt smoothly to different screen sizes.

## 🌟 Key CSS Techniques Used

- **Flexbox**: For flexible layouts
- **CSS Grid**: For the statistics display
- **CSS Variables**: For consistent theming (can be added)
- **Transforms**: For hover effects and animations
- **Box Shadows**: For depth and elevation
- **Border Radius**: For rounded corners
- **Linear Gradients**: For colorful backgrounds
- **Media Queries**: For responsive design

## 📝 License

This project is open source and available for educational purposes.

## 🤝 Contributing

Feel free to fork this project and customize it for your needs!

## 💡 Tips

- The CSS is organized by component for easy maintenance
- All colors are defined in the CSS files for easy customization
- Animations can be disabled by removing the `animation` properties
- The timer warning (red pulse) activates at 5 seconds remaining

---

**Happy Quizzing! 🎓**

Built with ❤️ using React and Custom CSS
