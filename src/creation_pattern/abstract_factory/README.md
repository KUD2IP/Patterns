<h1>Абстрактная фабрика (Abstract Factory)</h1>

<h2>Суть паттерна</h2>

<p>
Абстрактная фабрика — это порождающий паттерн проектирования, 
который позволяет создавать семейства связанных объектов,
не привязываясь к конкретным классам создаваемых объектов.
</p>

<h2>Проблема</h2>

<p>
Представьте, что вы пишете программу для магазина одежды. 

Ваш код содержит:
Семейство зависимых продуктов. Скажем, <code> Куртка</code> и <code> Обувь</code>.

Несколько вариаций этого семейства.
Например, представлены <code> Куртка</code> и <code> Обувь</code> 
для трёх времен года: <code> Лето</code>, <code> Демисезон</code> и <code> Зима</code>.
</p>

<p> 
Вам нужен такой способ создавать объекты продуктов,
чтобы они сочетались с другими продуктами того же семейства.

Кроме того, вы не хотите вносить изменения в существующий код 
при добавлении новых продуктов или семейcтв в программу. 
Магазины часто обновляют свои каталоги,
и вы бы не хотели менять уже написанный код каждый раз при получении новых экземпляров одежды.
</p>

<h2>Решение</h2>

<p>
Для начала паттерн Абстрактная фабрика предлагает 
выделить общие интерфейсы для отдельных продуктов,
составляющих семейство. Так, все вариации <code> курток</code> получат общий интерфейс <code> Jacket</code>,
всю <code> обувь</code> реализует интерфейс <code> Shoes</code> и так далее.

Далее вы создаёте абстрактную фабрику — общий интерфейс,
который содержит методы создания всех продуктов семейства 
(например, <code>createJacket</code> и <code>createShoes</code>).
Эти операции должны возвращать <b>абстрактные</b> типы продуктов,
представленные интерфейсами, которые мы выделили ранее — <code>Jacket</code> и <code>Shoes</code>.

Для каждой вариации семейства продуктов мы должны создать свою собственную фабрику,
реализовав абстрактный интерфейс. Фабрики создают продукты одной вариации.
Например, фабрика <code>SummerFactory</code> будет возвращать только одежду для <code>Лето</code> 
(<code>SummerJacket</code> и <code>SummerShoes</code>).

Клиентский код должен работать как с фабриками,
так и с продуктами только через их общие интерфейсы.
Это позволит подавать в ваши классы любой тип фабрики и производить любые продукты,
ничего не ломая.

Например, клиентский код просит фабрику сделать куртку.
Он не знает, какого типа была эта фабрика.
Он не знает, получит летнюю или зимнюю куртку.
Для него важно, чтобы куртку можно было надеть и чтобы 
эта куртка отлично смотрелась с обовью той же фабрики.
 
Кто создаёт объекты конкретных фабрик,
если клиентский код работает только с интерфейсами фабрик?
Обычно программа создаёт конкретный объект фабрики при запуске,
причём тип фабрики выбирается, исходя из параметров окружения или конфигурации.
</p>

<h3>1. Абстрактные продукты</h3>
<p>
Абстрактные продукты объявляют интерфейсы продуктов,
которые связаны друг с другом по смыслу, но выполняют разные функции.
</p>

<h3>2. Конкретные продукты</h3>
<p>
Конкретные продукты — большой набор классов,
которые относятся к различным абстрактным продуктам (куртка/обувь),
но имеют одни и те же вариации (Зимняя/Демисезонная/Летняя).
</p>

<h3>3. Абстрактная фабрика</h3>
<p>
Абстрактная фабрика объявляет методы создания различных абстрактных продуктов (куртка/обувь).
</p>

<h3>4. Конкретная фабрика</h3>
<p>
Конкретные фабрики относятся каждая к своей вариации продуктов (Зимняя/Демисезонная/Летняя)
и реализуют методы абстрактной фабрики, позволяя создавать все продукты определённой вариации.
</p>

<h3>5. Важно</h3>
<p>
Несмотря на то, что конкретные фабрики порождают конкретные продукты,
сигнатуры их методов должны возвращать соответствующие абстрактные продукты.
Это позволит клиентскому коду, использующему фабрику,
не привязываться к конкретным классам продуктов.
Клиент сможет работать с любыми вариациями продуктов через абстрактные интерфейсы.
</p>

<h2>Применимость</h2>
<p>
<b>Когда бизнес-логика программы должна работать с разными видами связанных друг с другом продуктов,
не завися от конкретных классов продуктов.</b>

Абстрактная фабрика скрывает от клиентского кода подробности того,
как и какие конкретно объекты будут созданы. Но при этом клиентский
код может работать со всеми типами создаваемых продуктов,
поскольку их общий интерфейс был заранее определён.


---


<b>Когда в программе уже используется Фабричный метод, но очередные изменения предполагают
введение новых типов продуктов.</b>

В хорошей программе каждый класс отвечает только за одну вещь.
Если класс имеет слишком много фабричных методов, они способны затуманить его основную функцию.
Поэтому имеет смысл вынести всю логику создания продуктов в отдельную иерархию классов,
применив абстрактную фабрику.
</p>