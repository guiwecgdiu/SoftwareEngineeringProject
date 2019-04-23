# Software-Engineering-Project Make It One
 - Yao Yuxiang 17205995(GROUP LEADER)
- Li Jiadi 17205985
- Li Zigen 17205998
- Su Zhan 17205994
- Zhang Yu 17205936

## Project Background
### What is it about?
It is a **integrated efficiency tool** which can help users to concentrate on things which should be focused. Its basic function is a clock which can be used to **record the time interval** which has been used to focus. 
### Why we design it?
For the following  two reasons:
- **Society issue is concerned**：
It has to be admitted that in the contemporary society, due to the use of Internet technology, more and more people obtain relevant information through mobile phones. But at the same time, we cannot ignore that, due to the widespread popularity of smart phones, more and more people have become dependent on mobile phones. We can easily see that many people around us are addicted to some applications of mobile devices. Some of them even cannot help chatting, playing games or watching videos on their mobile phones while studying and working. Based on our sense of social responsibility, we feel it is very necessary to develop a product to regulate their behaviors, so that it can reasonably arrange their time to use mobile devices. 
- **Potential market of products**:
There are some related apps available in today's market. But it is not difficult to find that the existed apps have a single function. Their target group are mainly students and office workers, which goals are mainly to help users improve their work efficiency. However, these goals are not satisfied people'need yet since our lives need not only these focused goals. From the other hand, the current phenomenon of mobile phone addiction can not only be found in students and office workers. Our app divides functionality into three parts: work, exercise, and meetings. The reason why we do this is that many people do not leave their mobile phones when they exercise regularly, and many people also start to play their mobile phones in meetings because they can't restrain themselves. Of course, that's why we call it *make it one*: our product is an integrated efficiency tool.

## Technologies
### Program Language: Java Language & XML Language(Android Studio)
Since we want to develop an Android App , we chose Android Studio as our development IDE. As we all know, there are currently two IDEs available for Android development. One is Android Studio, which we did not initially contact, and the other is Eclipse, which we have studied for nearly a semester. After consideration, we all agreed that Android Studio is more suitable for us, mainly because we hope that our choice will enable us to access more knowledge and skills. 
### Tool-kits: BaiduMap API
BaiduMap API  is used to ensure the validity of map navigation in the layout of "Focus on Sports", since it is easy to get and the price to pay is cheap.
### Databases: SQLite
In order to enable users to focus on the situations before querying, we use the SQLite Database, because it is seen as a remote and easy database to be accessed and modified.
### Platform: GitHub
In the field of teamwork, because we are a five-person team, we
choose GitHub as the platform for teamwork which will do help to the foundation for the success of our teamwork as it is a mature platform for group development.
 
## Time Management 
### Progress
- **week 1** 
Find the group members
- **week 2**
Propose several ideas,and decide the basic direction of project
- **week 3**
Settle down the theme of project  
- **week 4**
Code implementation: Component functions
- **week 5**
Code implementation: Component functions
- **week 6**
Preparation of presentation 
- **week 7**
Code implementation: Component functions
### Plan
- **week 8**
Code implementation: Layout Design
- **week 9**
Code implementation:Layout Design
- **week 10**
Code implementation: Final frame implementation 
- **week 11**
Code implementation: Final frame implementation
- **week 12**
Code implementation:
- **week 13**
Test: Test functions
- **week 14**
Test: Test overall performance
- **week 15**
Preparation of presentation
- **week 16**
Hand Out the final products 
## Team Management
### Yao Yuxiang (Group Leader)
- Formulation of action plans 
- Allocation of tasks throughout the team.
- Sets up the overall framework. 
### Li Jiadi 
- Code implementation 
- Data storage design
### Li Zigen 
- User interface design
### Su Zhan 
- Customer opinion survey 
- Components "Taking Notes" design. 
### Zhang Yu 
- Basic design of aesthetics

## Progress Details
### User requirements 
- **Timing & Countdown**:
	1. In "Focus on Studying" and "Focus on Sports", we implemented the *Countdown Function*,
	2. In "Focus on Meeting", we implemented the *Timing Function*,
- **Note Taking**:
This function is inside the "Focus on Meeting"
While taking meetings, it is necessary for users to take down notes since it is important to remind users not to forget some important things. What's more, users can query related notes in the *Settings* layout .

### Design
- **Timing & Countdown**:
Using *Chronometer* provided by Android Studio, and use related *views* in the layout. 
- **Note Taking**:
EditText View will enable users to write down what they want to remember. Notes will be saved in the database created in the  SQLite.

### Implementation 
There several steps in building applications within GitHub
1. Apply a Git Repo in GitHub
2. *Push Origin*  to add related code in the remote Git Repo
3.  *Clone* when changes are needed

### Testing 
Tests are based on the *Virtual Machine*
We will test the related functions in the virtual machine firstly, if it goes well, then it will be uploaded into the "real mobile phones"
