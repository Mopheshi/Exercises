stop_words = [
    "a", "able", "about", "above", "abroad", "according", "accordingly", "across", "act", "actually",
    "added", "adj", "adopted", "affected", "affects", "after", "afterwards", "again", "against", "ago",
    "ah", "ahead", "ain't", "all", "allow", "allows", "almost", "alone", "along", "already", "also",
    "although", "always", "am", "amid", "amidst", "among", "amongst", "an", "and", "announce", "another",
    "any", "anybody", "anyhow", "anymore", "anyone", "anything", "anyway", "anyways", "anywhere", "apart",
    "apparently", "appear", "appreciate", "appropriate", "approximately", "are", "aren", "aren't", "around",
    "as", "aside", "ask", "asking", "associated", "at", "auth", "available", "away", "awfully", "b",
    "back", "backward", "backwards", "be", "became", "because", "become", "becomes", "becoming", "been",
    "before", "beforehand", "begin", "beginning", "beginnings", "begins", "behind", "being", "believe",
    "below", "beside", "besides", "best", "better", "between", "beyond", "bill", "both", "bottom",
    "brief", "briefly", "but", "by", "c", "ca", "call", "came", "can", "cannot", "cant", "caption",
    "cause", "causes", "certain", "certainly", "changes", "clearly", "c'mon", "co", "co.", "com", "come",
    "comes", "computer", "con", "concerning", "consequently", "consider", "considering", "contain",
    "containing", "contains", "corresponding", "could", "couldnt", "couldn't", "course", "cry", "c's",
    "currently", "d", "dare", "daren't", "date", "de", "definitely", "describe", "described", "despite",
    "detail", "did", "didn't", "different", "directly", "do", "does", "doesn't", "doing", "done", "don't",
    "down", "downwards", "due", "during", "e", "each", "ed", "edu", "effect", "eg", "eight", "eighty",
    "either", "eleven", "else", "elsewhere", "empty", "end", "ending", "enough", "entirely", "especially",
    "et", "et-al", "etc", "even", "ever", "evermore", "every", "everybody", "everyone", "everything",
    "everywhere", "ex", "exactly", "example", "except", "f", "fairly", "far", "farther", "few", "fewer",
    "fifth", "first", "five", "followed", "following", "follows", "for", "forever", "former", "formerly",
    "forth", "forward", "found", "four", "from", "further", "furthermore", "g", "get", "gets", "getting",
    "given", "gives", "go", "goes", "going", "gone", "got", "gotten", "greetings", "h", "had", "hadn't",
    "half", "happens", "hardly", "has", "hasn't", "have", "haven't", "having", "he", "he'd", "he'll",
    "hello", "help", "hence", "her", "here", "hereafter", "hereby", "herein", "here's", "hereupon",
    "hers", "herself", "he's", "hi", "him", "himself", "his", "hither", "hopefully", "how", "howbeit",
    "however", "hundred", "i", "i'd", "ie", "if", "ignored", "i'll", "i'm", "immediate", "in", "inasmuch",
    "inc", "inc.", "indeed", "indicate", "indicated", "indicates", "inner", "inside", "insofar", "instead",
    "into", "inward", "is", "isn't", "it", "it'd", "it'll", "its", "it's", "itself", "i've", "j", "just",
    "k", "keep", "keeps", "kept", "know", "known", "knows", "l", "last", "lately", "later", "latter",
    "latterly", "least", "less", "lest", "let", "let's", "like", "liked", "likely", "likewise", "little",
    "look", "looking", "looks", "low", "lower", "ltd", "m", "made", "mainly", "make", "makes", "many",
    "may", "maybe", "mayn't", "me", "mean", "meantime", "meanwhile", "merely", "might", "mightn't",
    "mine", "minus", "miss", "more", "moreover", "most", "mostly", "mr", "mrs", "much", "must", "mustn't",
    "my", "myself", "n", "name", "namely", "nd", "near", "nearly", "necessary", "need", "needn't",
    "needs", "neither", "never", "neverf", "neverless", "nevertheless", "new", "next", "nine", "ninety",
    "no", "nobody", "non", "none", "nonetheless", "noone", "no-one", "nor", "normally", "not", "nothing",
    "notwithstanding", "novel", "now", "nowhere", "o", "obviously", "of", "off", "often", "oh", "ok",
    "okay", "old", "on", "once", "one", "ones", "one's", "only", "onto", "opposite", "or", "other",
    "others", "otherwise", "ought", "oughtn't", "our", "ours", "ourselves", "out", "outside", "over",
    "overall", "own", "p", "particular", "particularly", "past", "per", "perhaps", "placed", "please",
    "plus", "possible", "presumably", "probably", "provided", "provides", "q", "que", "quite", "qv", "r",
    "rather", "rd", "re", "really", "reasonably", "recent", "recently", "regarding", "regardless",
    "regards", "relatively", "respectively", "right", "round", "s", "said", "same", "saw", "say",
    "saying", "says", "second", "secondly", "see", "seeing", "seem", "seemed", "seeming", "seems",
    "seen", "self", "selves", "sensible", "sent", "serious", "seriously", "seven", "several", "shall",
    "shan't", "she", "she'd", "she'll", "she's", "should", "shouldn't", "since", "six", "so", "some",
    "somebody", "someday", "somehow", "someone", "something", "sometime", "sometimes", "somewhat",
    "somewhere", "soon", "sorry", "specified", "specify", "specifying", "still", "sub", "such",
    "sup", "sure", "t", "take", "taken", "taking", "tell", "tends", "th", "than", "thank", "thanks",
    "thanx", "that", "that'll", "thats", "that's", "that've", "the", "their", "theirs", "them",
    "themselves", "then", "thence", "there", "thereafter", "thereby", "there'd", "therefore",
    "therein", "there'll", "there're", "theres", "there's", "thereupon", "there've", "these",
    "they", "they'd", "they'll", "they're", "they've", "thing", "things", "think", "third",
    "thirty", "this", "thorough", "thoroughly", "those", "though", "three", "through", "throughout",
    "thru", "thus", "till", "to", "together", "too", "took", "toward", "towards", "tried", "tries",
    "truly", "try", "trying", "t's", "twice", "two", "u", "un", "under", "underneath", "undoing",
    "unfortunately", "unless", "unlike", "unlikely", "until", "unto", "up", "upon", "upwards", "us",
    "use", "used", "useful", "uses", "using", "usually", "v", "value", "various", "versus", "very",
    "via", "viz", "vs", "w", "want", "wants", "was", "wasn't", "way", "we", "we'd", "welcome",
    "well", "we'll", "went", "were", "we're", "weren't", "we've", "what", "whatever", "what'll",
    "what's", "what've", "when", "whence", "whenever", "where", "whereafter", "whereas", "whereby",
    "wherein", "where's", "whereupon", "wherever", "whether", "which", "whichever", "while", "whilst",
    "whither", "who", "who'd", "whoever", "whole", "who'll", "whom", "whomever", "who's", "whose",
    "why", "will", "willing", "wish", "with", "within", "without", "wonder", "won't", "would",
    "wouldn't", "x", "y", "yes", "yet", "you", "you'd", "you'll", "your", "you're", "yours",
    "yourself", "yourselves", "you've", "z", "zero"
]

positive_words = [
    "good", "great", "awesome", "excellent", "love", "like", "amazing", "happy", "nice", "wonderful", ":)", ":-)",
    "fantastic", "best", "better", "beautiful", "positive", "fun", "exciting", "joy", "glad", "satisfied",
    "superb", "cool", "terrific", "delightful", "pleasure", "smile", "laugh", "win", "success", "victory",
    "recommend", "enjoy", "perfect", "brilliant", "sweet", "charm", "attractive", "admirable", "graceful",
    "friendly", "honor", "pride", "respect", "support", "help", "kind", "generous", "polite", "fair", "honest",
    "loyal", "trust", "faith", "passion", "dream", "creative", "innovative", "progress", "improve", "benefit",
    "advantage", "value", "quality", "effective", "efficient", "smart", "intelligent", "knowledge", "wisdom",
]

negative_words = [
    "bad", "terrible", "horrible", "awful", "hate", "dislike", "disgusting", "unpleasant", "sad", "angry", ":(",
    ":-(", "mad", "annoyed", "disappointed", "unhappy", "miserable", "worst", "worse", "ugly", "negative", "boring",
    "stress", "anxiety", "fear", "pain", "loss", "failure", "defeat", "reject", "disagree", "dispute", "offend",
    "insult", "harm", "damage", "destroy", "ruin", "waste", "corrupt", "evil", "sin", "guilt", "shame", "regret",
    "mistake", "blame", "criticize", "accuse", "deny", "lie", "cheat", "steal", "fraud", "threat", "attack", "kill",
    "war", "conflict", "crisis", "disaster", "emergency", "danger", "risk", "problem", "trouble", "issue",
    "challenge",
]

message = '''
    Natural Language Processing (NLP) is a subfield of artificial intelligence that focuses on the interaction
    between computers and humans using natural language. It is used to apply machine learning algorithms to text and
    speech. Some common NLP tasks include part-of-speech tagging, named entity recognition, sentiment analysis,
    and text classification.
    '''

reviews = [
    "The food was delicious and the service was great!",
    "The food was terrible and the service was slow.",
    "The movie was fantastic and I would highly recommend it.",
    "The movie was awful and I would not recommend it to anyone.",
    "The product is excellent and works perfectly, although I don't fully understand how to use it.",
    "The product is defective and does not work as advertised, I am very disappointed with the purchase.",
    "The customer support team was very helpful and resolved my issue quickly.",
    "The customer support team was unresponsive and did not address my concerns.",
    "The company provides top-notch service and always delivers on time.",
    "The company has poor customer service and never responds to inquiries.",
    "The experience was amazing and I would definitely do it again!",
    "The experience was terrible and I would never do it again!",
    "The presentation was engaging and informative, I learned a lot from it.",
    "Programming is kinda difficult, although not always, but it can be a bit challenging at times...",
]

categories = {
    "Sports": [
        "football", "basketball", "tennis", "cricket", "soccer", "hockey", "baseball", "golf", "rugby", "chess",
        "boxing", "cycling", "swimming", "athletics", "volleyball", "badminton", "table tennis", "wrestling",
        "karate", "judo", "taekwondo", "gymnastics", "skiing", "snowboarding", "surfing", "skateboarding",
        "climbing", "hiking", "running", "jogging", "walking", "yoga", "pilates", "zumba", "exercise", "fitness",
        "health", "wellness", "nutrition", "diet", "weight loss", "muscle gain", "strength", "endurance",
        "flexibility", "balance", "coordination", "agility", "speed", "power", "performance", "competition",
        "championship", "tournament", "match", "game"
    ],
    "Politics": [
        "election", "government", "president", "minister", "parliament", "congress", "senate", "policy",
        "legislation", "law", "constitution", "democracy", "republic", "monarchy", "dictatorship", "totalitarianism",
        "fascism", "communism", "socialism", "capitalism", "liberalism", "conservatism", "progressivism",
        "nationalism", "patriotism", "anarchism", "populism", "authoritarianism", "bureaucracy", "corruption",
        "scandal", "lobbying", "activism", "protest", "demonstration", "revolution", "civil rights", "freedom",
        "equality", "justice", "peace", "war", "conflict"
    ],
    "Technology": [
        "software", "hardware", "internet", "computer", "smartphone", "data", "network", "digital", "tech",
        "information", "communication", "social media", "website", "app", "platform", "cloud", "cybersecurity",
        "privacy", "encryption", "blockchain", "artificial intelligence", "machine learning", "automation",
        "robotics", "virtual reality", "augmented reality", "gaming", "programming", "coding", "developer",
        "engineer", "designer", "innovation", "startup", "entrepreneur", "venture capital", "investment",
        "acquisition", "merger", "partnership", "collaboration", "integration", "development", "testing",
        "implementation", "deployment", "maintenance", "support", "upgrade", "update", "patch", "fix", "debug",
        "optimize", "customize", "personalize", "configure", "install", "uninstall", "backup", "restore", "nlp",
        "recover", "migrate", "scale", "monitor", "analyze", "report", "dashboard", "visualization", "dashboard",
        "automation", "scripting", "coding", "programming", "development", "testing", "debugging", "deployment",
        "integration", "maintenance", "support", "upgrade", "update", "patch", "fix", "optimize", "customize",
        "personalize", "configure", "install", "uninstall", "backup", "restore", "recover", "migrate", "scale",
        "api", "artificial intelligence", "ai", "deep learning", "neural networks", "natural language processing",
        "ml", "machine learning", "ml", "data science", "big data", "data analytics", "data visualization",
        "part-of-speech tagging", "named entity recognition", "sentiment analysis", "text classification", "ner",
        "pos", "nltk", "spacy", "stanfordnlp", "gensim", "textblob", "vader", "corenlp", "opennlp", "word2vec",
        "computer vision", "computer", "data", "privacy", "encryption", "blockchain", "virtual reality",
        "augmented reality", "gaming", "games", "quantum computing", "coding", "developer", "engineer", "designer",
    ],
    "Science": [
        "biology", "chemistry", "physics", "astronomy", "geology", "meteorology", "oceanography", "ecology",
        "environment", "climate", "weather", "earth", "space", "universe", "galaxy", "solar system", "planet",
        "star", "moon", "sun", "earthquake", "volcano", "hurricane", "tornado", "tsunami", "flood", "drought",
        "wildfire", "pollution", "deforestation", "extinction", "ecosystem", "species", "population", "evolution",
        "genetics", "dna", "cell", "organism", "organ", "tissue", "organ system", "immune system", "nervous system",
        "respiratory system", "circulatory system", "digestive system", "excretory system", "endocrine system",
        "reproductive system", "muscular system", "skeletal system", "integumentary system", "lymphatic system",
        "senses", "sight", "hearing", "smell", "taste", "touch", "perception", "sensation", "memory", "learning",
        "cognition", "consciousness", "intelligence", "emotion", "motivation", "behavior", "personality",
        "mental health", "psychology", "psychiatry", "neuroscience", "neurology", "cognitive science", "philosophy",
        "philosophy", "mathematics", "statistics", "engineering", "technology", "computer science", "information",
        "communication", "social science", "humanities", "arts", "culture", "society", "politics", "economics",
        "business", "education", "health", "medicine", "law", "justice", "ethics", "religion", "spirituality",
        "mythology", "folklore", "literature", "language", "linguistics", "communication", "media", "journalism",
        "entertainment", "music", "film", "television", "radio", "theater", "dance", "visual arts", "painting",
        "physics", "chemistry", "biology", "astronomy", "geology", "meteorology", "oceanography", "ecology",
        "agriculture", "environment", "climate", "weather", "earth", "space", "universe", "galaxy", "solar system"
    ],
    "Business": [
        "company", "business", "corporation", "enterprise", "organization", "industry", "market", "economy",
        "commerce", "trade", "finance", "investment", "capital", "profit", "revenue", "income", "expense",
        "cost", "price", "value", "quality", "product", "service", "customer", "client", "consumer", "supplier",
        "vendor", "partner", "competitor", "rival", "collaborator", "stakeholder", "shareholder", "investor",
        "stockholder", "employee", "employer", "worker", "manager", "executive", "leader", "entrepreneur",
        "stock market", "bond market", "commodity market", "currency market", "financial market", "equity market",
        "debt market", "capital market", "money market", "derivatives market", "options market", "futures market",
        "swaps market", "hedge fund", "private equity", "venture capital", "investment bank", "commercial bank",
        "retail bank", "corporate bank", "investment fund", "mutual fund", "exchange-traded fund", "hedge fund",
        "private equity fund", "venture capital fund", "investment portfolio", "investment strategy",
        "investment policy", "money", "funds", "fund", "capital", "assets", "liabilities", "equity", "debt", "revenue",
        "income", "profit", "loss", "expense", "cost", "price", "value", "quality", "product", "service", "customer",
    ]
}

import spacy
import pandas as pd
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.naive_bayes import MultinomialNB
from sklearn.pipeline import Pipeline
from sklearn.model_selection import train_test_split
from sklearn.metrics import classification_report

# Load spaCy model
nlp = spacy.load("en_core_web_sm")

# Load your support ticket dataset (replace with your own data)
# Assume you have a DataFrame with columns: "text" (ticket content) and "category" (label)
data = pd.read_csv("files/all_tickets.csv")

# Split data into train and test sets
X_train, X_test, y_train, y_test = train_test_split(data["text"], data["category"], test_size=0.2, random_state=42)

# Create a pipeline with TfidfVectorizer and Multinomial Naive Bayes classifier
pipeline = Pipeline([
    ("tfidf", TfidfVectorizer(tokenizer=lambda text: [token.lemma_ for token in nlp(text)])),
    ("clf", MultinomialNB())
])

# Train the model
pipeline.fit(X_train, y_train)

# Predict on test data
y_pred = pipeline.predict(X_test)

# Evaluate model performance
print(classification_report(y_test, y_pred))


# Example usage: classify a new support ticket
def classify_ticket(ticket_text):
    predicted_category = pipeline.predict([ticket_text])[0]
    return predicted_category


# Example usage
new_ticket = "My credit card was charged incorrectly."
predicted_category = classify_ticket(new_ticket)
print(f"Predicted category for the new ticket: {predicted_category}")
