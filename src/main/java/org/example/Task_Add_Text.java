package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_Add_Text {
    private static List<String> texts= new ArrayList<String>();

    static void WriteText() {
        texts.add("Не мысля гордый свет забавить,\n" +
                "Вниманье дружбы возлюбя,\n" +
                "Хотел бы я тебе представить\n" +
                "Залог достойнее тебя,\n" +
                "Достойнее души прекрасной,\n" +
                "Святой исполненной мечты,\n" +
                "Поэзии живой и ясной,\n" +
                "Высоких дум и простоты;\n" +
                "Но так и быть — рукой пристрастной\n" +
                "Прими собранье пестрых глав,\n" +
                "Полусмешных, полупечальных,\n" +
                "Простонародных, идеальных,\n" +
                "Небрежный плод моих забав,\n" +
                "Бессонниц, легких вдохновений,\n" +
                "Незрелых и увядших лет,\n" +
                "XAXA Ума холодных наблюдений\n" +
                "И сердца горестных замет.");
        texts.add("XAXA12345678900987654321" +
                "йцукенгшщзхъэждлорпавыфячсмитьбюё" +
                "QWERTYUIOPLKJHGFDSAZXCVBNM" +
                "ЮБЬТИМСЧЯЭЖДЛОРПАВЫФЪХЗЩШГНЕКУЦЙЁ" +
                "mnbvcxzasdfghjklpoiuytrewq" +
                "     -+=[]{}[][]{}{},,,////////////////////" +
                "........................................");
        texts.add("У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо — песнь заводит,\n" +
                "Налево — сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" +
                "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" +
                "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" +
                "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" +
                "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" +
                "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" +
                "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" +
                "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" +
                "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" +
                "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" +
                "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" +
                "Там царь Кащей над златом чахнет;\n" +
                "Там русский, XAXA, дух… там Русью пахнет!\n" +
                "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" +
                "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил.");
        texts.add("Мартышка к старости слаба глазами стала;\n" +
                "А у людей она слыхала,\n" +
                "Что это зло еще не так большой руки:\n" +
                "Лишь стоит завести Очки.\n" +
                "Очков с полдюжины себе она достала;\n" +
                "Вертит Очками так и сяк:\n" +
                "То к темю их прижмет, то их на хвост нанижет,\n" +
                "То их понюхает, то их полижет;\n" +
                "Очки не действуют никак.\n" +
                "«Тьфу пропасть! — говорит она, — и тот дурак,\n" +
                "Кто слушает людских всех врак:\n" +
                "Всё про Очки лишь мне налгали;\n" +
                "А проку на-волос нет в них».\n" +
                "Мартышка тут с досады и с печали\n" +
                "О камень так хватила их,\n" +
                "Что только брызги засверкали.\n" +
                "К несчастью, то ж бывает у людей:\n" +
                "Как ни полезна вещь, — цены не зная ей,\n" +
                "Невежда про нее свой толк все к худу клонит;\n" +
                "А ежели невежда познатней,\n" +
                "Так он ее еще и гонит.");
        texts.add("Лес, точно терем расписной,\n" +
                "Лиловый, золотой, багряный,\n" +
                "Веселой, пестрою стеной\n" +
                "Стоит над светлою поляной.\n" +
                "\n" +
                "Березы желтою резьбой\n" +
                "Блестят в лазури голубой,\n" +
                "Как вышки, елочки темнеют,\n" +
                "А между кленами синеют\n" +
                "То там, то здесь в листве сквозной\n" +
                "Просветы в небо, что оконца.\n" +
                "Лес пахнет дубом и сосной,\n" +
                "За лето высох он от солнца,\n" +
                "И Осень тихою вдовой\n" +
                "Вступает в пестрый терем свой.\n" +
                "Сегодня на пустой поляне,\n" +
                "Среди широкого двора,\n" +
                "Воздушной паутины ткани\n" +
                "Блестят, как сеть из серебра.\n" +
                "Сегодня целый день играет\n" +
                "В дворе последний мотылек\n" +
                "И, точно белый лепесток,\n" +
                "На паутине замирает,\n" +
                "Пригретый солнечным теплом;\n" +
                "Сегодня так светло кругом,\n" +
                "Такое мертвое молчанье\n" +
                "В лесу и в синей вышине,\n" +
                "Что можно в этой тишине\n" +
                "Расслышать листика шуршанье.\n" +
                "Лес, точно терем расписной,\n" +
                "Лиловый, золотой, багряный,\n" +
                "Стоит над солнечной поляной,\n" +
                "Завороженный тишиной;\n" +
                "Заквохчет дрозд, перелетая\n" +
                "Среди подседа, где густая\n" +
                "Листва янтарный отблеск льет;\n" +
                "Играя, в небе промелькнет\n" +
                "Скворцов рассыпанная стая —\n" +
                "И снова все кругом замрет.\n" +
                "Последние мгновенья счастья!\n" +
                "Уж знает Осень, что такой\n" +
                "Глубокий и немой покой —\n" +
                "Предвестник долгого ненастья.\n" +
                "Глубоко, странно лес молчал\n" +
                "И на заре, когда с заката\n" +
                "Пурпурный блеск огня и злата\n" +
                "Пожаром терем освещал.\n" +
                "Потом угрюмо в нем стемнело.\n" +
                "Луна восходит, а в лесу\n" +
                "Ложатся тени на росу…\n" +
                "Вот стало холодно и бело\n" +
                "Среди полян, среди сквозной\n" +
                "Осенней чащи помертвелой,\n" +
                "И жутко Осени одной\n" +
                "В пустынной тишине ночной.\n" +
                "\n" +
                "Теперь уж тишина другая:\n" +
                "Прислушайся — она растет,\n" +
                "А с нею, бледностью пугая,\n" +
                "И месяц медленно встает.\n" +
                "Все тени сделал он короче,\n" +
                "Прозрачный дым навел на лес\n" +
                "И вот уж смотрит прямо в очи\n" +
                "С туманной высоты небес.\n" +
                "0, мертвый сон осенней ночи!\n" +
                "0, жуткий час ночных чудес!\n" +
                "В сребристом и сыром тумане\n" +
                "Светло и пусто на поляне;\n" +
                "Лес, белым светом залитой,\n" +
                "Своей застывшей красотой\n" +
                "Как будто смерть себе пророчит;\n" +
                "Сова и та молчит: сидит\n" +
                "Да тупо из ветвей глядит,\n" +
                "Порою дико захохочет,\n" +
                "Сорвется с шумом с высоты,\n" +
                "Взмахнувши мягкими крылами,\n" +
                "И снова сядет на кусты\n" +
                "И смотрит круглыми глазами,\n" +
                "Водя ушастой головой\n" +
                "По сторонам, как в изумленье;\n" +
                "А лес стоит в оцепененье,\n" +
                "Наполнен бледной, легкой мглой\n" +
                "И листьев сыростью гнилой…\n" +
                "Не жди: наутро не проглянет\n" +
                "На небе солнце. Дождь и мгла\n" +
                "Холодным дымом лес туманят,—\n" +
                "Недаром эта ночь прошла!\n" +
                "Но Осень затаит глубоко\n" +
                "Все, что она пережила\n" +
                "В немую ночь, и одиноко\n" +
                "Запрется в тереме своем:\n" +
                "Пусть бор бушует под дождем,\n" +
                "Пусть мрачны и ненастны ночи\n" +
                "И на поляне волчьи очи\n" +
                "Зеленым светятся огнем!\n" +
                "Лес, точно терем без призора,\n" +
                "Весь потемнел и полинял,\n" +
                "Сентябрь, кружась по чащам бора,\n" +
                "С него местами крышу снял\n" +
                "И вход сырой листвой усыпал;\n" +
                "А там зазимок ночью выпал\n" +
                "И таять стал, все умертвив…\n" +
                "\n" +
                "Трубят рога в полях далеких,\n" +
                "Звенит их медный перелив,\n" +
                "Как грустный вопль, среди широких\n" +
                "Ненастных и туманных нив.\n" +
                "Сквозь шум деревьев, за долиной,\n" +
                "Теряясь в глубине лесов,\n" +
                "Угрюмо воет рог туриный,\n" +
                "Скликая на добычу псов,\n" +
                "И звучный гам их голосов\n" +
                "Разносит бури шум пустынный.\n" +
                "Льет дождь, холодный, точно лед,\n" +
                "Кружатся листья по полянам,\n" +
                "И гуси длинным караваном\n" +
                "Над лесом держат перелет.\n" +
                "Но дни идут. И вот уж дымы\n" +
                "Встают столбами на заре,\n" +
                "Леса багряны, недвижимы,\n" +
                "Земля в морозном серебре,\n" +
                "И в горностаевом шугае,\n" +
                "Умывши бледное лицо,\n" +
                "Последний день в лесу встречая,\n" +
                "Выходит Осень на крыльцо.\n" +
                "Двор пуст и холоден. В ворота,\n" +
                "Среди двух высохших осин,\n" +
                "Видна ей синева долин\n" +
                "И ширь пустынного болота,\n" +
                "Дорога на далекий юг:\n" +
                "Туда от зимних бурь и вьюг,\n" +
                "От зимней стужи и метели\n" +
                "Давно уж птицы улетели;\n" +
                "Туда и Осень поутру\n" +
                "Свой одинокий путь направит\n" +
                "И навсегда в пустом бору\n" +
                "Раскрытый терем свой оставит.\n" +
                "\n" +
                "Прости же, лес! Прости, прощай,\n" +
                "День будет ласковый, хороший,\n" +
                "И скоро мягкою порошей\n" +
                "Засеребрится мертвый край.\n" +
                "Как будут странны в этот белый,\n" +
                "Пустынный и холодный день\n" +
                "И бор, и терем опустелый,\n" +
                "И крыши тихих деревень,\n" +
                "И небеса, и без границы\n" +
                "В них уходящие поля!\n" +
                "Как будут рады соболя,\n" +
                "И горностаи, и куницы,\n" +
                "Резвясь и греясь на бегу\n" +
                "В сугробах мягких на лугу!\n" +
                "А там, как буйный пляс шамана,\n" +
                "Ворвутся в голую тайгу\n" +
                "Ветры из тундры, с океана,\n" +
                "Гудя в крутящемся снегу\n" +
                "И завывая в поле зверем.\n" +
                "Они разрушат старый терем,\n" +
                "Оставят колья и потом\n" +
                "На этом остове пустом\n" +
                "Повесят инеи сквозные,\n" +
                "И будут в небе голубом\n" +
                "Сиять чертоги ледяные\n" +
                "И хрусталем и серебром.\n" +
                "А в ночь, меж белых их разводов,\n" +
                "Взойдут огни небесных сводов,\n" +
                "Заблещет звездный щит Стожар —\n" +
                "В тот час, когда среди молчанья\n" +
                "Морозный светится пожар,\n" +
                "Расцвет полярного сиянья.");
        texts.add("Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth.\n" +
                "\n" +
                "Then took the other, as just as fair,\n" +
                "And having perhaps the better claim,\n" +
                "Because it was grassy and wanted wear;\n" +
                "Though as for that the passing there\n" +
                "Had worn them really about the same.\n" +
                "\n" +
                "And both that morning equally lay\n" +
                "In leaves no step had trodden black.\n" +
                "Oh, I kept the first for another day!\n" +
                "Yet knowing how way leads on to way,\n" +
                "I doubted if I should ever come back.\n" +
                "\n" +
                "I shall be telling this with a sigh\n" +
                "Somewhere ages and ages hence:\n" +
                "Two roads diverged in a wood, and I—\n" +
                "I took the one less traveled by,\n" +
                "And that has made all the difference.");
        texts.add("If you can keep your head when all about you\n" +
                "Are losing theirs and blaming it on you,\n" +
                "If you can trust yourself when all men doubt you,\n" +
                "But make allowance for their doubting too;\n" +
                "If you can wait and not be tired by waiting,\n" +
                "Or being lied about, don’t deal in lies,\n" +
                "Or being hated don’t give way to hating,\n" +
                "And yet don’t look too good, nor talk too wise:\n" +
                "If you can dream-and not make dreams your master;\n" +
                "If you can think-and not make thoughts your aim,\n" +
                "If you can meet with Triumph and Disaster\n" +
                "And treat those two impostors just the same;\n" +
                "If you can bear to hear the truth you’ve spoken\n" +
                "Twisted by knaves to make a trap for fools,\n" +
                "Or watch the things you gave your life to, broken,\n" +
                "And stoop and build ’em up with worn-out tools:\n" +
                "If you can make one heap of all your winnings\n" +
                "And risk it on one turn of pitch-and-toss,\n" +
                "And lose, and start again at your beginnings\n" +
                "And never breathe a word about your loss;\n" +
                "If you can force your heart and nerve and sinew\n" +
                "To serve your turn long after they are gone,\n" +
                "And so hold on when there is nothing in you\n" +
                "Except the Will which says to them: ‘Hold on!’\n" +
                "If you can talk with crowds and keep your virtue,\n" +
                "Or walk with Kings-nor lose the common touch,\n" +
                "If neither foes nor loving friends can hurt you,\n" +
                "If all men count with you, but none too much;\n" +
                "If you can fill the unforgiving minute\n" +
                "With sixty seconds’ worth of distance run,\n" +
                "Yours is the Earth and everything that’s in it,\n" +
                "And-which is more-you’ll be a Man, my son!");
        texts.add("I was run over by the truth one day.\n" +
                "Ever since the accident I’ve walked this way\n" +
                "So stick my legs in plaster\n" +
                "Tell me lies about Vietnam.\n" +
                "\n" +
                "Heard the alarm clock screaming with pain,\n" +
                "Couldn’t find myself so I went back to sleep again\n" +
                "So fill my ears with silver\n" +
                "Stick my legs in plaster\n" +
                "Tell me lies about Vietnam.\n" +
                "\n" +
                "Every time I shut my eyes all I see is flames.\n" +
                "Made a marble phone book and I carved out all the names\n" +
                "So coat my eyes with butter\n" +
                "Fill my ears with silver\n" +
                "Stick my legs in plaster\n" +
                "Tell me lies about Vietnam.\n" +
                "\n" +
                "I smell something burning, hope it’s just my brains.\n" +
                "They’re only dropping peppermints and daisy-chains\n" +
                "So stuff my nose with garlic\n" +
                "Coat my eyes with butter\n" +
                "Fill my ears with silver\n" +
                "Stick my legs in plaster\n" +
                "Tell me lies about Vietnam.\n" +
                "\n" +
                "Where were you at the time of the crime?\n" +
                "Down by the Cenotaph drinking slime\n" +
                "So chain my tongue with whisky\n" +
                "Stuff my nose with garlic\n" +
                "Coat my eyes with butter\n" +
                "Fill my ears with silver\n" +
                "Stick my legs in plaster\n" +
                "Tell me lies about Vietnam.\n" +
                "\n" +
                "You put your bombers in, you put your conscience out,\n" +
                "You take the human being and you twist it all about\n" +
                "So scrub my skin with women\n" +
                "Chain my tongue with whisky\n" +
                "Stuff my nose with garlic\n" +
                "Coat my eyes with butter\n" +
                "Fill my ears with silver\n" +
                "Stick my legs in plaster\n" +
                "Tell me lies about Vietnam.");
        texts.add("In 1931, three researchers from the University of Vienna travelled to Marienthal, a small town about twenty miles away, to study the effects of long-term unemployment. Two years before, Austria’s banking system had collapsed. The town’s main employer, a textile factory, had closed, laying off hundreds of workers.\n" +
                "\n" +
                "The researchers found that Marienthal had been transformed by these economic ravages. “When a cat or dog disappears, the owner no longer bothers to report the loss; he knows that someone must have eaten the animal, and he does not want to find out who,” they wrote. People consumed mainly bread and coffee, the latter “stretched” with roasted figs or chicory to last longer; cabbage and potatoes vanished regularly from farmers’ fields. The town’s wrestling team, accustomed to success, could no longer field a heavyweight. Beyond material deprivations lay apathy and despair. A once regular reader of the newspaper explained that “now I just flip through it and then throw it away, even though I have more time.” After applying for a hundred and thirty jobs with no success, another man spent half his days in bed. Political meetings shrank, fewer books were checked out from the library, and domestic quarrels and alcoholism shadowed marriages. Even children felt hopeless: “I want to be a pilot, a submarine captain, an Indian chief, and a mechanic,” one twelve-year-old boy wrote in a school essay. “But I am afraid it will be very difficult to find a job.”\n" +
                "\n" +
                "The trio’s study was published in 1933, as “Die Arbeitslosen von Marienthal” (“The Unemployed of Marienthal”). The booklet, which became an early classic of sociology, showed that employment provides much more than an income. Work is a source of structure, esteem, and motivation, and its disappearance can lead to depression, anxiety, addiction, and interpersonal turmoil. (It’s estimated that as many as one in five suicides can be linked to joblessness.) As Hitler’s power grew, the yearnings for activity, structure, and community articulated by the unemployed in the Marienthal study came to seem newly ominous. “On a large scale it is quite probable that part of the success of the early Hitler movement came about because large numbers of unemployed were taken into barracks and kept busy with paramilitary training,” one of the sociologists wrote, in a foreword to the American edition.\n" +
                "\n" +
                "Marienthal still exists, although, over the course of the twentieth century, it came to be subsumed by a neighboring village called Gramatneusiedl. In the fall of 2020, the Austrian government’s public-employment agency decided to launch a job-guarantee program there—an initiative that would guarantee work to the unemployed. Anyone who has been jobless for a year or more now has the option of a guaranteed job for the duration of the program. In some cases, it’s a subsidized private-sector position; in others, a nonprofit works with participants to create a job that meets local needs. The original study wanted to learn how unemployment affected people. The current experiment, which is run by the Public Employment Service of Lower Austria, and is being studied by economists at Oxford and sociologists at the University of Vienna, asks the opposite question: What happens when anyone who wants a decent job can get one?\n" +
                "\n" +
                "Iarrived in Gramatneusiedl on a warm July morning, in 2021. My interpreter, Helma Kinzl, couldn’t believe she was really there—in Austria, “Gramatneusiedl” is sometimes used as an expression for a small town in the middle of nowhere. Looking around, I could see why. About three thousand people live in the village, which is bisected by a single quiet road, with a church, a café, and a handful of small shops and restaurants. Many shop windows were shuttered. Flat farmland stretched away in every direction.\n" +
                "\n" +
                "So far, a hundred and twelve people have used the Job Guarantee, as the program is known, to find work; at least fifty more are expected to do so before 2024, when the program is scheduled to end. Participants complete an eight-week training course, then receive a job offer; they’re free to decline it without losing their unemployment benefits, but so far everyone who’s been offered a job has chosen to work. This is likely because participants discuss their skills and interests with social workers during the training period. Early on, a few proposed starting a carpentry workshop, and it now restores old furniture and builds new pieces; others have asked for jobs maintaining public parks and local green areas, and are now being paid to do so. People work between sixteen and thirty-eight hours a week, depending on their goals, medical needs, and caretaking obligations. Salaries, which typically range between eleven hundred and twenty-four hundred euros a month, are set so that everyone earns at least as much as they previously received in unemployment benefits. A year on unemployment—including payments, subsidies, and lost taxes—costs the Austrian government an average of thirty thousand euros. Each guaranteed job costs an average of €29,841.39.\n" +
                "\n" +
                "The Job Guarantee is headquartered in a mansion where the owner of Marienthal’s now demolished textile factory once lived; a single smokestack looms behind the mansion. When I arrived, about a dozen people were clustered on the building’s front steps, drinking coffee and chatting before work. Inside, on the first floor, a group sat at tables covered with fabrics, bags, and sewing machines. This was a weaving workshop. A blond woman in her fifties worked on animal-themed children’s backpacks, adorned with pink-and-white elephant ears or a blue dragon’s tail.\n" +
                "\n" +
                "“Kids like them,” she said. She showed off a handbag made from old pairs of bluejeans. Most of the material the workshop used had been donated or scrounged from secondhand-clothing shops; the bags were sold at a market in town.\n" +
                "\n" +
                "The carpentry studio was situated in a high-ceilinged warehouse about a hundred yards from the mansion. The carpenters, men and women ranging from their twenties to their fifties, wore protective goggles, overalls, and work shirts; they were preparing to sand and refinish dozens of collapsible wooden benches, which had just been dropped off by the local fire brigade. (It rents them out for parties, baptisms, and other events.) Orders like this generate money for the program: about five per cent of its €7.4 million budget comes from these community sales. Much of the furniture that the group restores is donated. Ancient, battered storage chests, cupboards, and headboards, as well as a collapsed early-twentieth-century hay wagon, littered the space. The restored pieces would be displayed for sale in town, in the window of a shoe-repair shop that had recently closed.\n" +
                "\n" +
                "Karl Blaha, a fiftysomething cobbler who’d once run the shoe shop, gave me a tour of the space the next day. The words “Schuhe Blaha” loomed above the storefront in blocky white letters; the interior was dim and musty. Pincers, awls, shoe molds, and scraps of leather cluttered a back room. “This is where we used to work,” Blaha said, with a sigh. Slender and silver-haired, he worked thirty hours a week in the Job Guarantee program, both in the carpentry studio and as a German teacher for participants who were still learning the language. “Nobody wanted their shoes repaired anymore, when they could just buy a cheap new pair like that,” he said, miming the clicking of a mouse. The shop had operated for more than a hundred years, including during the original Marienthal study, but closed in 2019.\n" +
                "\n" +
                "That afternoon, at a shady table outside the old mansion, I had coffee with Monika, a fifty-seven-year-old participant in Job Guarantee. Like many others in the program, Monika hadn’t struggled to find work until her life underwent a sudden, dramatic change: eleven years earlier, she’d been working as an aide to the elderly when a man collapsed onto her as she was helping him from his wheelchair into the shower; her back was badly injured, and her doctor told her that she could not lift more than five kilograms. She applied to positions, but her age and medical limitations made finding a new job hard. She got one offer, but it would have required her to move to Germany, and her elderly parents live in Gramatneusiedl. “It’s more important to be able to look after my parents than to go to Germany,” she said.\n" +
                "\n" +
                "Other participants had experienced something similar. Adnan Rizvanovic, a Bosnian man in his early sixties who now works as a gardener for the program, had once driven trucks and taxis and held a job in logistics. Pay for drivers plummeted after Uber and its local Austrian competitors entered the taxi market; after two heart attacks, Rizvanovic decided that he’d better stay off the road, lest he have another and crash. “I was psychologically destroyed,” he told me, of being suddenly unemployed. “If you have worked your whole life, even with a lot of stress, then suddenly you have nothing to do, you think that you are not needed anymore,” he said. “You have your breakfast, and then—what am I going to do all day?” He applied to dozens of jobs without success and began to lose hope. “At this age, after two heart attacks, it’s impossible,” he said. “Once they hear a certain age, it’s no way.” He began staying up all night, binge-watching basketball games. His daughter got him a dog so that he would leave the house more often.\n" +
                "\n" +
                "Through the Job Guarantee, Rizvanovic worked twenty hours a week doing light gardening. “It’s nice. It’s slow. You have time to think when you water the flowers. It’s like meditation,” he said, gesturing at the plants around us. He was sleeping better and watching less TV. He enjoyed seeing other people at work every day, and could take breaks whenever he was getting tired—something that his cardiologist says is important. Before the war in Bosnia forced him to leave for Austria, in the nineteen-nineties, he studied philosophy and law at university. “When I’m watering the flowers, I think about Sigmund Freud and Immanuel Kant and everybody,” he told me, with a wistful look.\n" +
                "\n" +
                "Not every participant sees the program as a decisive improvement over unemployment benefits. A man named Gilbert—bearish, heavily tattooed, and fifty-two—told me that he had worked for decades as a technician installing and maintaining elevators before injuring his back and knee in a skiing accident. He’d enjoyed his time on unemployment, which he’d spent travelling to the Dominican Republic, riding around Austria with his motorcycle club, and fighting in raucous freestyle forest brawls that set fans of rival soccer teams against one another, before sealing the peace over beer. He wouldn’t have minded a few more years of that life, he said; still, he worked thirty hours a week in the carpentry workshop, earning a little more than two thousand euros a month. “I just want to work something for the next eight years,” he said—until he can take his pension. “If I earn my eighteen hundred or nineteen hundred, I’ll do anything—unless I really, really don’t like it.”\n" +
                "\n" +
                "Critics of labor-market programs such as the Job Guarantee argue that they enable precisely this sort of choice—they make it easier to decline work that one doesn’t like. One program participant in his thirties told me that, while on unemployment benefits, he’d been offered a job cleaning toilets at a gas station; he’d decided that he didn’t want “that sort of job,” and had instead found work in the carpentry workshop. If everyone were guaranteed a reasonably pleasant job, suited to their interests and needs and paying a living wage, who would do the grungy, difficult work? Austrian employers, like those in America, are currently having difficulty hiring people to take hard, poorly paid jobs; many of the workers in Austria who wash dishes or clean hotel rooms are immigrants from Eastern Europe, and during the pandemic many of them went home, some for good. Jörg Flecker, a sociologist at the University of Vienna who is evaluating the program in Gramatneusiedl, told me that pressure from employers could prevent its expansion across Austria. “Employers say, ‘There are so many unemployed. We have to have a tougher regime for them because we have jobs to fill.’ ”\n" +
                "\n" +
                "Lukas Lehner and Maximilian Kasy, economists at Oxford who are evaluating data from Gramatneusiedl, argue that competition with the private sector is a good thing. “I think, from an economic perspective, that argument doesn’t make much sense,” Kasy said, of the dirty-jobs view. “If they’re shit jobs, try to pay them as well as possible. Try to change the working conditions as much as possible until you reach the point that somebody wants to do them, or automate them if you can. And then, if nobody wants to do them, maybe we shouldn’t do them.” Kasy thinks that an important function of initiatives like job guarantees—and of universal basic incomes—is to improve the bargaining positions of people who want to change their lives. “Whether it’s abuse from an employment relationship, a bureaucrat in the welfare state, or a romantic relationship, the question is, What’s your outside option?” he said. “Having the safety of the basic income or a guaranteed job improves your outside option. If your boss is abusive, or doesn’t respect your hours, or is harassing you or whatever, you have the option to say no.”\n" +
                "\n" +
                "I met Denise Berger in Gramatneusiedl, and she said she had faced exactly this sort of situation. For years, she’d been sexually abused by her stepfather; the psychological effects caused her to struggle in her job at a pastry shop. She lost her position, but was unable to move out of her parents’ home. Through the Job Guarantee, she worked twenty hours a week cleaning at a kindergarten, and she could afford her own small apartment, where she lived with her two dogs. Her brothers, she said, had been harshly critical of her inability to find a job: “You’re stupid, you’re kind of a bad person, you don’t have a job, so you’re good for nothing,” she recalled them saying. That changed during the pandemic, when two of them also lost work. Nothing challenges stereotypes about the unemployed, she told me, like becoming one of them.\n" +
                "\n" +
                "Unemployment in Austria, as in many Western countries, has been rising gradually for decades. In 2021, the official figure was eight per cent. This likely understates the real number of unemployed people; as in the United States, Austria’s official statistics don’t account for those who have simply stopped looking for work. Unwanted joblessness is fairly common. And yet the stigma faced by the long-term unemployed is powerful. Flecker, the sociologist, has noticed that Job Guarantee participants are often eager to show that they’re not typical unemployed people. “They say, ‘Oh, well, I’m not like the others. I have a special role here,’ ” he told me. Many of the participants I spoke with noted that they were in the group who wanted to work, whereas some others in the program were, as they put it, lazy free riders.\n" +
                "\n" +
                "On my last day in Gramatneusiedl, I had coffee with Thomas Schwab, its mayor, at the Job Guarantee headquarters. An older man who speaks with a cautious, professorial air, Schwab wrote his master’s thesis on the original Marienthal study; he sees the current project against this historical background. “Maybe you know about Adam Smith, and these guys who say that the market is always right,” he said. “If you don’t find a job, then just work for less money. But that’s completely wrong! If I have no jobs in my company, there can be a thousand people outside, and they could say, like in the nineteen-thirties, ‘I will work just for something to eat.’ Did they find a job? They didn’t find a job, because nobody had a job to offer.”\n" +
                "\n" +
                "Sven Hergovich, the regional director of the Public Employment Service of Lower Austria, essentially agrees with this analysis. He thinks that rising demands for productivity and efficiency mean that, now and in the future, not everyone will be able to find a job without support. “There are not sufficient jobs available for all of the long-term unemployed,” he told me. “In fact, we have only two options. Either we finance long-term unemployment, or we create a job guarantee.”\n" +
                "\n" +
                "Ultimately, the perceived success of any job-guarantee program depends on what you think its goals should be. Kasy, the Oxford economist, thinks that there are three factors we ought to consider. Are people doing better on objective and subjective measures of well-being? Do they participate voluntarily? And does the program cost roughly the same as, or less than, current unemployment benefits? He and his colleagues studied the Gramatneusiedl program using a randomized controlled trial, in which waves of participants who started at different times were compared against one another, against a statistical composite of similar unemployed people from similar towns in Austria that lack a job guarantee, and against other factors. So far, on a broad range of dimensions—symptoms of anxiety or depression, a sense of social inclusion, social status, financial security, and so on—the improvements in participants’ lives are statistically significant. Kasy noted that the Job Guarantee costs no more per person than unemployment benefits. “It comes for free, people choose it voluntarily, and they feel like they’re better off—you would think that’s a slam dunk,” he said.\n" +
                "\n" +
                "If the aim of job-guarantee programs is to transition all participants to private-sector jobs, or to dramatically cut unemployment spending, they may be hard to defend. But, if the goals are to improve people’s physical and mental health, to perform a range of tasks in a community, and to move some participants back to the private sector, then prospects look more promising. Since my visit to Gramatneusiedl, many of the participants have transitioned out of the program to other jobs. Karl Blaha, of the shoe emporium, is now a facility manager for a private logistics and transport company. Gilbert, of the forest brawls, is a restaurant manager.\n" +
                "\n" +
                "And there are other, broader ways in which such programs can benefit society. Unemployment and despair are hardly the only causes of political extremism, but scholars have perceived a connection between these factors in multiple places and time periods. Before leaving Gramatneusiedl, I visited its historical museum, a quiet one-room building just off the main road. Inside, photographs from the early twentieth century showed musicians with fiddles and accordions, villagers picnicking in a garden with top hats and glasses of wine, and rows of young men in wrestling uniforms, crossing burly arms. By the early nineteen-thirties, however, the mood had shifted. Men lounged on a street corner, hands in pockets, gazes downcast; workers took sledgehammers to the old factory, destroying the place where they used to work. Within a few more years, a burst of activity again animated the town. Nazism had arrived. Pictures showed a parade, banners, bustling crowds—and, draped across the lectern of a man addressing the villagers, a swastika.\n");
    }

    static String GetRandomText() {
        Random random = new Random();
        int index = random.nextInt(0, texts.size());
        return texts.get(index);
    }

    static void LookTexts() {
        for (int i = 0; i < texts.size(); i++) {
            System.out.print("Текст " + (i + 1) + ": ");
            for (int j = 0; j < 20; j++) {
                System.out.print(texts.get(i).charAt(j));
            }
            System.out.println(" - букв: " + texts.get(i).length());
        }
    }

    static String GetCurrentText(int number) {
        if (number > 1 && number <= texts.size()) {
            return texts.get(number - 1);
        }
        System.out.println("Нет такого текста! Получите рандом.");
        return GetRandomText();
    }

}
