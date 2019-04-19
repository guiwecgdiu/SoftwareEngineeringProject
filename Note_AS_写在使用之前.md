---


---

<blockquote>
<p>大家好,在进行安卓开发之前务必读完本文</p>
</blockquote>
<h2 id="如何解决一些常见的问题">如何解决一些常见的问题</h2>
<h3 id="如果出现gradle-sync-wrong的问题">如果出现Gradle Sync Wrong的问题</h3>
<p>注意一般情况下是不会出现这种问题的，除非是你更改了AS的配置。所以我建议：</p>
<ul>
<li>不要随便升级AS（即便它提示可以有新的版本可用）</li>
<li>如果真的升级了而且之后会出现了这样的问题，请连上VPN之后进行“Try  Again”</li>
<li>如果以上两种方法都不行，请及时联系淘宝买家</li>
</ul>
<h3 id="在运行虚拟机的时候出现了unfortunately.....">在运行虚拟机的时候出现了Unfortunately…</h3>
<p>注意这个一般来说是XML文件出现了问题，建议重新仔细检查在哪里出错（因为XML文件没有自动纠错能力（甚至是拼写错误），要仔细检查），可以通过查看log进行查阅</p>
<h2 id="在开始之前的准备">在开始之前的准备</h2>
<h3 id="请找到以下的文件夹，并创建快捷方式到自己的桌面，方便自己后期操作">请找到以下的文件夹，并创建快捷方式到自己的桌面，方便自己后期操作</h3>
<ul>
<li>AndroidStudioProjects（我的是在用户-公用文件夹中）</li>
</ul>
<blockquote>
<p>C:\Users\Public\AndroidStudioProjects</p>
</blockquote>
<ul>
<li>AS-SDK（我的是在安卓文件夹中）</li>
</ul>
<blockquote>
<p>C:\Android\AS-SDK</p>
</blockquote>
<h3 id="如何从github官网上进行代码的下载">如何从GitHub官网上进行代码的下载</h3>
<p>分为以下几个步骤</p>
<ul>
<li>第一步打开自己的GitHub，从官网上找到我拉到网上的仓库，选择<strong>Clone Or Download</strong> ，复制SSH码<br>
<img src="https://i.imgur.com/s77Vi8Y.jpg" alt="我的仓库"></li>
<li>打开自己的AndroidStudioProjects文件夹，选择<strong>git bash here</strong>，输入命令行语句</li>
</ul>
<blockquote>
<p>git clone 自己的刚刚复制的SSH码</p>
</blockquote>
<p><img src="https://i.imgur.com/iumErT0.jpg" alt="clone的过程"><br>
稍后即可显示clone操作完成<br>
（注意，在AndroidStudioProjects中不能有和仓库有着相同名字的文件夹，否则会报错！）</p>
<ul>
<li>打开AS的软件，选择<strong>open</strong>，从文件夹中选择自己刚刚克隆的项目即可。</li>
</ul>

