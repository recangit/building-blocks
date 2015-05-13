I denna mapp läggs tester för grundläggande tekniker och principer

Polymorfism
Chain of responsibility
Open closed principle
Känna till relation
Har relation
Är relation

Överskugga eller Override, samma metod/metoder deklareras i super och subklass. 
Vid anrop används den metod som objektet refererar till. Detta kallas också polymorfism.
Finns inte metoden i subklassen kommer metoden sökas högre upp i klasshierarkin, 
alltså superklassen. Detta kallas dynamisk bindning.

Överlagra, klass med flera konstruktorer och/eller metoder med samma namn. 
Antalet inparametrar eller typ av inparametrar särskiljer de olika metoderna.

Objekt och instanser kan aldrig anropas från en static context. Tvärtom går bra.

X?  X, once or not at all 
X*  X, zero or more times 
X+  X, one or more times 
X{n}  X, exactly n times 
X{n,}  X, at least n times 
X{n,m}  X, at least n but not more than m times

Vid deserialization anropas INTE konstruktorn.

start för att sparka igång run.

Mockade tester

Det finns en del information sparat i Yojimbo.

http://www.javacertifications.net/javacert/scjp1.6Mock.jsp

=============================================================
överlagring - (overloading) - i programmering - allmänt: när samma namn används för flera olika operationer eller funktioner. 
Vilken av dem som ska användas beror på sammanhanget. Termen används främst inom objektorienterad programmering, se polymorfism. 
Där betyder det att samma namngivna metod kan realiseras på flera olika sätt, beroende på vilken klass eller subklass som det 
anropade objektet tillhör. - Överlagring ska inte förväxlas med överskuggning (overriding).

polymorfism - (polymorphism) - i programmering: när en och samma instruktion i ett programspråk kan utföras på olika sätt. 
Vilket sätt som väljs avgörs av sammanhanget. Termen används främst inom objektorienterad programmering och innebär där att 
en och samma metod utförs på olika sätt i olika klasser av objekt. Detta är möjligt i objektorienterade program därför att 
koden som anger hur ett anrop ska utföras ingår i objektet, inte i anropet. Anropet anger bara namnet på metoden och vilka 
argument som ingår. - Se också överlagring (overloading) och överskuggning (overloading).

överskuggning - (overriding) - i objektorienterad programmering: att ange att en metod i en subklass ska användas i stället 
för den metod som subklassen har ärvt från en överordnad klass. Detta görs när den ärvda metoden av någon anledning är olämplig 
i subklassen. En överskuggande metod har samma namn och samma argument som metoden som den överskuggar. - Överskuggning ska 
inte förväxlas med överlagring (overloading). Se också polymorfism.

dynamic coupling - se dynamisk bindning,

git pull origin master
git push -u origin master
