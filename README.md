I denna mapp l�ggs tester f�r grundl�ggande tekniker och principer

Polymorfism
Chain of responsibility
Open closed principle
K�nna till relation
Har relation
�r relation

�verskugga eller Override, samma metod/metoder deklareras i super och subklass. 
Vid anrop anv�nds den metod som objektet refererar till. Detta kallas ocks� polymorfism.
Finns inte metoden i subklassen kommer metoden s�kas h�gre upp i klasshierarkin, 
allts� superklassen. Detta kallas dynamisk bindning.

�verlagra, klass med flera konstruktorer och/eller metoder med samma namn. 
Antalet inparametrar eller typ av inparametrar s�rskiljer de olika metoderna.

Objekt och instanser kan aldrig anropas fr�n en static context. Tv�rtom g�r bra.

X?  X, once or not at all 
X*  X, zero or more times 
X+  X, one or more times 
X{n}  X, exactly n times 
X{n,}  X, at least n times 
X{n,m}  X, at least n but not more than m times

Vid deserialization anropas INTE konstruktorn.

start f�r att sparka ig�ng run.

Mockade tester

Det finns en del information sparat i Yojimbo.

http://www.javacertifications.net/javacert/scjp1.6Mock.jsp

=============================================================
�verlagring - (overloading) - i programmering - allm�nt: n�r samma namn anv�nds f�r flera olika operationer eller funktioner. 
Vilken av dem som ska anv�ndas beror p� sammanhanget. Termen anv�nds fr�mst inom objektorienterad programmering, se polymorfism. 
D�r betyder det att samma namngivna metod kan realiseras p� flera olika s�tt, beroende p� vilken klass eller subklass som det 
anropade objektet tillh�r. - �verlagring ska inte f�rv�xlas med �verskuggning (overriding).

polymorfism - (polymorphism) - i programmering: n�r en och samma instruktion i ett programspr�k kan utf�ras p� olika s�tt. 
Vilket s�tt som v�ljs avg�rs av sammanhanget. Termen anv�nds fr�mst inom objektorienterad programmering och inneb�r d�r att 
en och samma metod utf�rs p� olika s�tt i olika klasser av objekt. Detta �r m�jligt i objektorienterade program d�rf�r att 
koden som anger hur ett anrop ska utf�ras ing�r i objektet, inte i anropet. Anropet anger bara namnet p� metoden och vilka 
argument som ing�r. - Se ocks� �verlagring (overloading) och �verskuggning (overloading).

�verskuggning - (overriding) - i objektorienterad programmering: att ange att en metod i en subklass ska anv�ndas i st�llet 
f�r den metod som subklassen har �rvt fr�n en �verordnad klass. Detta g�rs n�r den �rvda metoden av n�gon anledning �r ol�mplig 
i subklassen. En �verskuggande metod har samma namn och samma argument som metoden som den �verskuggar. - �verskuggning ska 
inte f�rv�xlas med �verlagring (overloading). Se ocks� polymorfism.

dynamic coupling - se dynamisk bindning,

git pull origin master
git push -u origin master
