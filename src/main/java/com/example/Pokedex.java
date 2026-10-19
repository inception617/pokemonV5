package com.example;

import javafx.scene.image.Image;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Pokedex {
    Random random = new Random();

    private static Type Type = new Type("");
    private static Type BugType = new Type("Bug");
    private static Type DarkType = new Type("Dark");
    private static Type DragonType = new Type("Dragon");
    private static Type ElectricType = new Type("Electric");
    private static Type FairyType = new Type("Fairy");
    private static Type FightingType = new Type("Fighting");
    private static Type FireType = new Type("Fire");
    private static Type FlyingType = new Type("Flying");
    private static Type GhostType = new Type("Ghost");
    private static Type GrassType = new Type("Grass");
    private static Type GroundType = new Type("Ground");
    private static Type IceType = new Type("Ice");
    private static Type NormalType = new Type("Normal");
    private static Type PoisonType = new Type("Poison");
    private static Type PsychicType = new Type("Psychic");
    private static Type RockType = new Type("Rock");
    private static Type SteelType = new Type("Steel");
    private static Type WaterType = new Type("Water");
    
static Pokemon bulbasaur = new Pokemon(1,"Bulbasaur");
static Pokemon ivysaur = new Pokemon(2,"Ivysaur");
static Pokemon venusaur = new Pokemon(3,"Venusaur");
static Pokemon charmander = new Pokemon(4,"Charmander");
static Pokemon charmeleon = new Pokemon(5,"Charmeleon");
static Pokemon charizard = new Pokemon(6,"Charizard");
static Pokemon squirtle = new Pokemon(7,"Squirtle");
static Pokemon wartortle = new Pokemon(8,"Wartortle");
static Pokemon blastoise = new Pokemon(9,"Blastoise");
static Pokemon ekans = new Pokemon(23,"Ekans");
static Pokemon arbok = new Pokemon(24,"Arbok");
static Pokemon pikachu = new Pokemon(25,"Pikachu");
static Pokemon raichu = new Pokemon(26,"Raichu");
static Pokemon sandshrew = new Pokemon(27,"Sandshrew");
static Pokemon sandslash = new Pokemon(28,"Sandslash");
static Pokemon clefairy = new Pokemon(35,"Clefairy");
static Pokemon clefable = new Pokemon(36,"Clefable");
static Pokemon vulpix = new Pokemon(37,"Vulpix");
static Pokemon ninetales = new Pokemon(38,"Ninetales");
static Pokemon jigglypuff = new Pokemon(39,"Jigglypuff");
static Pokemon wigglytuff = new Pokemon(40,"Wigglytuff");
static Pokemon oddish = new Pokemon(43,"Oddish");
static Pokemon gloom = new Pokemon(44,"Gloom");
static Pokemon vileplume = new Pokemon(45,"Vileplume");
static Pokemon venonat = new Pokemon(48,"Venonat");
static Pokemon venomoth = new Pokemon(49,"Venomoth");
static Pokemon diglett = new Pokemon(50,"Diglett");
static Pokemon dugtrio = new Pokemon(51,"Dugtrio");
static Pokemon meowth = new Pokemon(52,"Meowth");
static Pokemon persian = new Pokemon(53,"Persian");
static Pokemon psyduck = new Pokemon(54,"Psyduck");
static Pokemon golduck = new Pokemon(55,"Golduck");
static Pokemon mankey = new Pokemon(56,"Mankey");
static Pokemon primeape = new Pokemon(57,"Primeape");
static Pokemon growlithe = new Pokemon(58,"Growlithe");
static Pokemon arcanine = new Pokemon(59,"Arcanine");
static Pokemon poliwag = new Pokemon(60,"Poliwag");
static Pokemon poliwhirl = new Pokemon(61,"Poliwhirl");
static Pokemon poliwrath = new Pokemon(62,"Poliwrath");
static Pokemon bellsprout = new Pokemon(69,"Bellsprout");
static Pokemon weepinbell = new Pokemon(70,"Weepinbell");
static Pokemon victreebel = new Pokemon(71,"Victreebel");
static Pokemon tentacool = new Pokemon(72,"Tentacool");
static Pokemon tentacruel = new Pokemon(73,"Tentacruel");
static Pokemon geodude = new Pokemon(74,"Geodude");
static Pokemon graveler = new Pokemon(75,"Graveler");
static Pokemon golem = new Pokemon(76,"Golem");
static Pokemon slowpoke = new Pokemon(79,"Slowpoke");
static Pokemon slowbro = new Pokemon(80,"Slowbro");
static Pokemon magnemite = new Pokemon(81,"Magnemite");
static Pokemon magneton = new Pokemon(82,"Magneton");
static Pokemon doduo = new Pokemon(84,"Doduo");
static Pokemon dodrio = new Pokemon(85,"Dodrio");
static Pokemon seel = new Pokemon(86,"Seel");
static Pokemon dewgong = new Pokemon(87,"Dewgong");
static Pokemon grimer = new Pokemon(88,"Grimer");
static Pokemon muk = new Pokemon(89,"Muk");
static Pokemon shellder = new Pokemon(90,"Shellder");
static Pokemon cloyster = new Pokemon(91,"Cloyster");
static Pokemon gastly = new Pokemon(92,"Gastly");
static Pokemon haunter = new Pokemon(93,"Haunter");
static Pokemon gengar = new Pokemon(94,"Gengar");
static Pokemon drowzee = new Pokemon(96,"Drowzee");
static Pokemon hypno = new Pokemon(97,"Hypno");
static Pokemon voltorb = new Pokemon(100,"Voltorb");
static Pokemon electrode = new Pokemon(101,"Electrode");
static Pokemon exeggcute = new Pokemon(102,"Exeggcute");
static Pokemon exeggutor = new Pokemon(103,"Exeggutor");
static Pokemon hitmonlee = new Pokemon(106,"Hitmonlee");
static Pokemon hitmonchan = new Pokemon(107,"Hitmonchan");
static Pokemon koffing = new Pokemon(109,"Koffing");
static Pokemon weezing = new Pokemon(110,"Weezing");
static Pokemon rhyhorn = new Pokemon(111,"Rhyhorn");
static Pokemon rhydon = new Pokemon(112,"Rhydon");
static Pokemon chansey = new Pokemon(113,"Chansey");
static Pokemon horsea = new Pokemon(116,"Horsea");
static Pokemon seadra = new Pokemon(117,"Seadra");
static Pokemon scyther = new Pokemon(123,"Scyther");
static Pokemon electabuzz = new Pokemon(125,"Electabuzz");
static Pokemon magmar = new Pokemon(126,"Magmar");
static Pokemon tauros = new Pokemon(128,"Tauros");
static Pokemon magikarp = new Pokemon(129,"Magikarp");
static Pokemon gyarados = new Pokemon(130,"Gyarados");
static Pokemon lapras = new Pokemon(131,"Lapras");
static Pokemon ditto = new Pokemon(132,"Ditto");
static Pokemon eevee = new Pokemon(133,"Eevee");
static Pokemon vaporeon = new Pokemon(134,"Vaporeon");
static Pokemon jolteon = new Pokemon(135,"Jolteon");
static Pokemon flareon = new Pokemon(136,"Flareon");
static Pokemon porygon = new Pokemon(137,"Porygon");
static Pokemon snorlax = new Pokemon(143,"Snorlax");
static Pokemon articuno = new Pokemon(144,"Articuno");
static Pokemon zapdos = new Pokemon(145,"Zapdos");
static Pokemon moltres = new Pokemon(146,"Moltres");
static Pokemon dratini = new Pokemon(147,"Dratini");
static Pokemon dragonair = new Pokemon(148,"Dragonair");
static Pokemon dragonite = new Pokemon(149,"Dragonite");
static Pokemon mewtwo = new Pokemon(150,"Mewtwo");
static Pokemon mew = new Pokemon(151,"Mew");
static Pokemon chikorita = new Pokemon(152,"Chikorita");
static Pokemon bayleef = new Pokemon(153,"Bayleef");
static Pokemon meganium = new Pokemon(154,"Meganium");
static Pokemon cyndaquil = new Pokemon(155,"Cyndaquil");
static Pokemon quilava = new Pokemon(156,"Quilava");
static Pokemon typhlosion = new Pokemon(157,"Typhlosion");
static Pokemon totodile = new Pokemon(158,"Totodile");
static Pokemon croconaw = new Pokemon(159,"Croconaw");
static Pokemon feraligatr = new Pokemon(160,"Feraligatr");
static Pokemon sentret = new Pokemon(161,"Sentret");
static Pokemon furret = new Pokemon(162,"Furret");
static Pokemon hoothoot = new Pokemon(163,"Hoothoot");
static Pokemon noctowl = new Pokemon(164,"Noctowl");
static Pokemon spinarak = new Pokemon(167,"Spinarak");
static Pokemon ariados = new Pokemon(168,"Ariados");
static Pokemon chinchou = new Pokemon(170,"Chinchou");
static Pokemon lanturn = new Pokemon(171,"Lanturn");
static Pokemon pichu = new Pokemon(172,"Pichu");
static Pokemon cleffa = new Pokemon(173,"Cleffa");
static Pokemon igglybuff = new Pokemon(174,"Igglybuff");
static Pokemon mareep = new Pokemon(179,"Mareep");
static Pokemon flaaffy = new Pokemon(180,"Flaaffy");
static Pokemon ampharos = new Pokemon(181,"Ampharos");
static Pokemon bellossom = new Pokemon(182,"Bellossom");
static Pokemon marill = new Pokemon(183,"Marill");
static Pokemon azumarill = new Pokemon(184,"Azumarill");
static Pokemon sudowoodo = new Pokemon(185,"Sudowoodo");
static Pokemon politoed = new Pokemon(186,"Politoed");
static Pokemon hoppip = new Pokemon(187,"Hoppip");
static Pokemon skiploom = new Pokemon(188,"Skiploom");
static Pokemon jumpluff = new Pokemon(189,"Jumpluff");
static Pokemon aipom = new Pokemon(190,"Aipom");
static Pokemon sunkern = new Pokemon(191,"Sunkern");
static Pokemon sunflora = new Pokemon(192,"Sunflora");
static Pokemon yanma = new Pokemon(193,"Yanma");
static Pokemon wooper = new Pokemon(194,"Wooper");
static Pokemon quagsire = new Pokemon(195,"Quagsire");
static Pokemon espeon = new Pokemon(196,"Espeon");
static Pokemon umbreon = new Pokemon(197,"Umbreon");
static Pokemon murkrow = new Pokemon(198,"Murkrow");
static Pokemon slowking = new Pokemon(199,"Slowking");
static Pokemon misdreavus = new Pokemon(200,"Misdreavus");
static Pokemon girafarig = new Pokemon(203,"Girafarig");
static Pokemon pineco = new Pokemon(204,"Pineco");
static Pokemon forretress = new Pokemon(205,"Forretress");
static Pokemon dunsparce = new Pokemon(206,"Dunsparce");
static Pokemon gligar = new Pokemon(207,"Gligar");
static Pokemon snubbull = new Pokemon(209,"Snubbull");
static Pokemon granbull = new Pokemon(210,"Granbull");
static Pokemon qwilfish = new Pokemon(211,"Qwilfish");
static Pokemon scizor = new Pokemon(212,"Scizor");
static Pokemon heracross = new Pokemon(214,"Heracross");
static Pokemon sneasel = new Pokemon(215,"Sneasel");
static Pokemon teddiursa = new Pokemon(216,"Teddiursa");
static Pokemon ursaring = new Pokemon(217,"Ursaring");
static Pokemon slugma = new Pokemon(218,"Slugma");
static Pokemon magcargo = new Pokemon(219,"Magcargo");
static Pokemon swinub = new Pokemon(220,"Swinub");
static Pokemon piloswine = new Pokemon(221,"Piloswine");
static Pokemon delibird = new Pokemon(225,"Delibird");
static Pokemon skarmory = new Pokemon(227,"Skarmory");
static Pokemon houndour = new Pokemon(228,"Houndour");
static Pokemon houndoom = new Pokemon(229,"Houndoom");
static Pokemon kingdra = new Pokemon(230,"Kingdra");
static Pokemon phanpy = new Pokemon(231,"Phanpy");
static Pokemon donphan = new Pokemon(232,"Donphan");
static Pokemon porygon2 = new Pokemon(233,"Porygon2");
static Pokemon stantler = new Pokemon(234,"Stantler");
static Pokemon smeargle = new Pokemon(235,"Smeargle");
static Pokemon tyrogue = new Pokemon(236,"Tyrogue");
static Pokemon hitmontop = new Pokemon(237,"Hitmontop");
static Pokemon elekid = new Pokemon(239,"Elekid");
static Pokemon magby = new Pokemon(240,"Magby");
static Pokemon blissey = new Pokemon(242,"Blissey");
static Pokemon raikou = new Pokemon(243,"Raikou");
static Pokemon entei = new Pokemon(244,"Entei");
static Pokemon suicune = new Pokemon(245,"Suicune");
static Pokemon larvitar = new Pokemon(246,"Larvitar");
static Pokemon pupitar = new Pokemon(247,"Pupitar");
static Pokemon tyranitar = new Pokemon(248,"Tyranitar");
static Pokemon lugia = new Pokemon(249,"Lugia");
static Pokemon ho_oh = new Pokemon(250,"Ho-Oh");
static Pokemon treecko = new Pokemon(252,"Treecko");
static Pokemon grovyle = new Pokemon(253,"Grovyle");
static Pokemon sceptile = new Pokemon(254,"Sceptile");
static Pokemon torchic = new Pokemon(255,"Torchic");
static Pokemon combusken = new Pokemon(256,"Combusken");
static Pokemon blaziken = new Pokemon(257,"Blaziken");
static Pokemon mudkip = new Pokemon(258,"Mudkip");
static Pokemon marshtomp = new Pokemon(259,"Marshtomp");
static Pokemon swampert = new Pokemon(260,"Swampert");
static Pokemon poochyena = new Pokemon(261,"Poochyena");
static Pokemon mightyena = new Pokemon(262,"Mightyena");
static Pokemon lotad = new Pokemon(270,"Lotad");
static Pokemon lombre = new Pokemon(271,"Lombre");
static Pokemon ludicolo = new Pokemon(272,"Ludicolo");
static Pokemon seedot = new Pokemon(273,"Seedot");
static Pokemon nuzleaf = new Pokemon(274,"Nuzleaf");
static Pokemon shiftry = new Pokemon(275,"Shiftry");
static Pokemon wingull = new Pokemon(278,"Wingull");
static Pokemon pelipper = new Pokemon(279,"Pelipper");
static Pokemon ralts = new Pokemon(280,"Ralts");
static Pokemon kirlia = new Pokemon(281,"Kirlia");
static Pokemon gardevoir = new Pokemon(282,"Gardevoir");
static Pokemon surskit = new Pokemon(283,"Surskit");
static Pokemon masquerain = new Pokemon(284,"Masquerain");
static Pokemon shroomish = new Pokemon(285,"Shroomish");
static Pokemon breloom = new Pokemon(286,"Breloom");
static Pokemon slakoth = new Pokemon(287,"Slakoth");
static Pokemon vigoroth = new Pokemon(288,"Vigoroth");
static Pokemon slaking = new Pokemon(289,"Slaking");
static Pokemon makuhita = new Pokemon(296,"Makuhita");
static Pokemon hariyama = new Pokemon(297,"Hariyama");
static Pokemon azurill = new Pokemon(298,"Azurill");
static Pokemon nosepass = new Pokemon(299,"Nosepass");
static Pokemon sableye = new Pokemon(302,"Sableye");
static Pokemon meditite = new Pokemon(307,"Meditite");
static Pokemon medicham = new Pokemon(308,"Medicham");
static Pokemon plusle = new Pokemon(311,"Plusle");
static Pokemon minun = new Pokemon(312,"Minun");
static Pokemon volbeat = new Pokemon(313,"Volbeat");
static Pokemon illumise = new Pokemon(314,"Illumise");
static Pokemon gulpin = new Pokemon(316,"Gulpin");
static Pokemon swalot = new Pokemon(317,"Swalot");
static Pokemon numel = new Pokemon(322,"Numel");
static Pokemon camerupt = new Pokemon(323,"Camerupt");
static Pokemon torkoal = new Pokemon(324,"Torkoal");
static Pokemon spoink = new Pokemon(325,"Spoink");
static Pokemon grumpig = new Pokemon(326,"Grumpig");
static Pokemon trapinch = new Pokemon(328,"Trapinch");
static Pokemon vibrava = new Pokemon(329,"Vibrava");
static Pokemon flygon = new Pokemon(330,"Flygon");
static Pokemon cacnea = new Pokemon(331,"Cacnea");
static Pokemon cacturne = new Pokemon(332,"Cacturne");
static Pokemon swablu = new Pokemon(333,"Swablu");
static Pokemon altaria = new Pokemon(334,"Altaria");
static Pokemon zangoose = new Pokemon(335,"Zangoose");
static Pokemon seviper = new Pokemon(336,"Seviper");
static Pokemon barboach = new Pokemon(339,"Barboach");
static Pokemon whiscash = new Pokemon(340,"Whiscash");
static Pokemon corphish = new Pokemon(341,"Corphish");
static Pokemon crawdaunt = new Pokemon(342,"Crawdaunt");
static Pokemon feebas = new Pokemon(349,"Feebas");
static Pokemon milotic = new Pokemon(350,"Milotic");
static Pokemon shuppet = new Pokemon(353,"Shuppet");
static Pokemon banette = new Pokemon(354,"Banette");
static Pokemon duskull = new Pokemon(355,"Duskull");
static Pokemon dusclops = new Pokemon(356,"Dusclops");
static Pokemon tropius = new Pokemon(357,"Tropius");
static Pokemon chimecho = new Pokemon(358,"Chimecho");
static Pokemon snorunt = new Pokemon(361,"Snorunt");
static Pokemon glalie = new Pokemon(362,"Glalie");
static Pokemon luvdisc = new Pokemon(370,"Luvdisc");
static Pokemon bagon = new Pokemon(371,"Bagon");
static Pokemon shelgon = new Pokemon(372,"Shelgon");
static Pokemon salamence = new Pokemon(373,"Salamence");
static Pokemon beldum = new Pokemon(374,"Beldum");
static Pokemon metang = new Pokemon(375,"Metang");
static Pokemon metagross = new Pokemon(376,"Metagross");
static Pokemon regirock = new Pokemon(377,"Regirock");
static Pokemon regice = new Pokemon(378,"Regice");
static Pokemon registeel = new Pokemon(379,"Registeel");
static Pokemon latias = new Pokemon(380,"Latias");
static Pokemon latios = new Pokemon(381,"Latios");
static Pokemon kyogre = new Pokemon(382,"Kyogre");
static Pokemon groudon = new Pokemon(383,"Groudon");
static Pokemon rayquaza = new Pokemon(384,"Rayquaza");
static Pokemon jirachi = new Pokemon(385,"Jirachi");
static Pokemon deoxys = new Pokemon(386,"Deoxys");
static Pokemon turtwig = new Pokemon(387,"Turtwig");
static Pokemon grotle = new Pokemon(388,"Grotle");
static Pokemon torterra = new Pokemon(389,"Torterra");
static Pokemon chimchar = new Pokemon(390,"Chimchar");
static Pokemon monferno = new Pokemon(391,"Monferno");
static Pokemon infernape = new Pokemon(392,"Infernape");
static Pokemon piplup = new Pokemon(393,"Piplup");
static Pokemon prinplup = new Pokemon(394,"Prinplup");
static Pokemon empoleon = new Pokemon(395,"Empoleon");
static Pokemon starly = new Pokemon(396,"Starly");
static Pokemon staravia = new Pokemon(397,"Staravia");
static Pokemon staraptor = new Pokemon(398,"Staraptor");
static Pokemon kricketot = new Pokemon(401,"Kricketot");
static Pokemon kricketune = new Pokemon(402,"Kricketune");
static Pokemon shinx = new Pokemon(403,"Shinx");
static Pokemon luxio = new Pokemon(404,"Luxio");
static Pokemon luxray = new Pokemon(405,"Luxray");
static Pokemon cranidos = new Pokemon(408,"Cranidos");
static Pokemon rampardos = new Pokemon(409,"Rampardos");
static Pokemon shieldon = new Pokemon(410,"Shieldon");
static Pokemon bastiodon = new Pokemon(411,"Bastiodon");
static Pokemon combee = new Pokemon(415,"Combee");
static Pokemon vespiquen = new Pokemon(416,"Vespiquen");
static Pokemon pachirisu = new Pokemon(417,"Pachirisu");
static Pokemon buizel = new Pokemon(418,"Buizel");
static Pokemon floatzel = new Pokemon(419,"Floatzel");
static Pokemon shellos = new Pokemon(422,"Shellos");
static Pokemon gastrodon = new Pokemon(423,"Gastrodon");
static Pokemon ambipom = new Pokemon(424,"Ambipom");
static Pokemon drifloon = new Pokemon(425,"Drifloon");
static Pokemon drifblim = new Pokemon(426,"Drifblim");
static Pokemon mismagius = new Pokemon(429,"Mismagius");
static Pokemon honchkrow = new Pokemon(430,"Honchkrow");
static Pokemon chingling = new Pokemon(433,"Chingling");
static Pokemon stunky = new Pokemon(434,"Stunky");
static Pokemon skuntank = new Pokemon(435,"Skuntank");
static Pokemon bronzor = new Pokemon(436,"Bronzor");
static Pokemon bronzong = new Pokemon(437,"Bronzong");
static Pokemon bonsly = new Pokemon(438,"Bonsly");
static Pokemon happiny = new Pokemon(440,"Happiny");
static Pokemon spiritomb = new Pokemon(442,"Spiritomb");
static Pokemon gible = new Pokemon(443,"Gible");
static Pokemon gabite = new Pokemon(444,"Gabite");
static Pokemon garchomp = new Pokemon(445,"Garchomp");
static Pokemon munchlax = new Pokemon(446,"Munchlax");
static Pokemon riolu = new Pokemon(447,"Riolu");
static Pokemon lucario = new Pokemon(448,"Lucario");
static Pokemon hippopotas = new Pokemon(449,"Hippopotas");
static Pokemon hippowdon = new Pokemon(450,"Hippowdon");
static Pokemon croagunk = new Pokemon(453,"Croagunk");
static Pokemon toxicroak = new Pokemon(454,"Toxicroak");
static Pokemon finneon = new Pokemon(456,"Finneon");
static Pokemon lumineon = new Pokemon(457,"Lumineon");
static Pokemon snover = new Pokemon(459,"Snover");
static Pokemon abomasnow = new Pokemon(460,"Abomasnow");
static Pokemon weavile = new Pokemon(461,"Weavile");
static Pokemon magnezone = new Pokemon(462,"Magnezone");
static Pokemon rhyperior = new Pokemon(464,"Rhyperior");
static Pokemon electivire = new Pokemon(466,"Electivire");
static Pokemon magmortar = new Pokemon(467,"Magmortar");
static Pokemon yanmega = new Pokemon(469,"Yanmega");
static Pokemon leafeon = new Pokemon(470,"Leafeon");
static Pokemon glaceon = new Pokemon(471,"Glaceon");
static Pokemon gliscor = new Pokemon(472,"Gliscor");
static Pokemon mamoswine = new Pokemon(473,"Mamoswine");
static Pokemon porygon_z = new Pokemon(474,"Porygon-Z");
static Pokemon gallade = new Pokemon(475,"Gallade");
static Pokemon probopass = new Pokemon(476,"Probopass");
static Pokemon dusknoir = new Pokemon(477,"Dusknoir");
static Pokemon froslass = new Pokemon(478,"Froslass");
static Pokemon rotom = new Pokemon(479,"Rotom");
static Pokemon uxie = new Pokemon(480,"Uxie");
static Pokemon mesprit = new Pokemon(481,"Mesprit");
static Pokemon azelf = new Pokemon(482,"Azelf");
static Pokemon dialga = new Pokemon(483,"Dialga");
static Pokemon palkia = new Pokemon(484,"Palkia");
static Pokemon heatran = new Pokemon(485,"Heatran");
static Pokemon regigigas = new Pokemon(486,"Regigigas");
static Pokemon giratina_altered = new Pokemon(487,"Giratina");
static Pokemon cresselia = new Pokemon(488,"Cresselia");
static Pokemon phione = new Pokemon(489,"Phione");
static Pokemon manaphy = new Pokemon(490,"Manaphy");
static Pokemon darkrai = new Pokemon(491,"Darkrai");
static Pokemon shaymin_land = new Pokemon(492,"Shaymin");
static Pokemon arceus = new Pokemon(493,"Arceus");
static Pokemon snivy = new Pokemon(495,"Snivy");
static Pokemon servine = new Pokemon(496,"Servine");
static Pokemon serperior = new Pokemon(497,"Serperior");
static Pokemon tepig = new Pokemon(498,"Tepig");
static Pokemon pignite = new Pokemon(499,"Pignite");
static Pokemon emboar = new Pokemon(500,"Emboar");
static Pokemon oshawott = new Pokemon(501,"Oshawott");
static Pokemon dewott = new Pokemon(502,"Dewott");
static Pokemon samurott = new Pokemon(503,"Samurott");
static Pokemon blitzle = new Pokemon(522,"Blitzle");
static Pokemon zebstrika = new Pokemon(523,"Zebstrika");
static Pokemon drilbur = new Pokemon(529,"Drilbur");
static Pokemon excadrill = new Pokemon(530,"Excadrill");
static Pokemon timburr = new Pokemon(532,"Timburr");
static Pokemon gurdurr = new Pokemon(533,"Gurdurr");
static Pokemon conkeldurr = new Pokemon(534,"Conkeldurr");
static Pokemon sewaddle = new Pokemon(540,"Sewaddle");
static Pokemon swadloon = new Pokemon(541,"Swadloon");
static Pokemon leavanny = new Pokemon(542,"Leavanny");
static Pokemon cottonee = new Pokemon(546,"Cottonee");
static Pokemon whimsicott = new Pokemon(547,"Whimsicott");
static Pokemon petilil = new Pokemon(548,"Petilil");
static Pokemon lilligant = new Pokemon(549,"Lilligant");
static Pokemon basculin = new Pokemon(550,"Basculin");
static Pokemon sandile = new Pokemon(551,"Sandile");
static Pokemon krokorok = new Pokemon(552,"Krokorok");
static Pokemon krookodile = new Pokemon(553,"Krookodile");
static Pokemon scraggy = new Pokemon(559,"Scraggy");
static Pokemon scrafty = new Pokemon(560,"Scrafty");
static Pokemon zorua = new Pokemon(570,"Zorua");
static Pokemon zoroark = new Pokemon(571,"Zoroark");
static Pokemon minccino = new Pokemon(572,"Minccino");
static Pokemon cinccino = new Pokemon(573,"Cinccino");
static Pokemon gothita = new Pokemon(574,"Gothita");
static Pokemon gothorita = new Pokemon(575,"Gothorita");
static Pokemon gothitelle = new Pokemon(576,"Gothitelle");
static Pokemon solosis = new Pokemon(577,"Solosis");
static Pokemon duosion = new Pokemon(578,"Duosion");
static Pokemon reuniclus = new Pokemon(579,"Reuniclus");
static Pokemon ducklett = new Pokemon(580,"Ducklett");
static Pokemon swanna = new Pokemon(581,"Swanna");
static Pokemon deerling = new Pokemon(585,"Deerling");
static Pokemon sawsbuck = new Pokemon(586,"Sawsbuck");
static Pokemon foongus = new Pokemon(590,"Foongus");
static Pokemon amoonguss = new Pokemon(591,"Amoonguss");
static Pokemon alomomola = new Pokemon(594,"Alomomola");
static Pokemon joltik = new Pokemon(595,"Joltik");
static Pokemon galvantula = new Pokemon(596,"Galvantula");
static Pokemon tynamo = new Pokemon(602,"Tynamo");
static Pokemon eelektrik = new Pokemon(603,"Eelektrik");
static Pokemon eelektross = new Pokemon(604,"Eelektross");
static Pokemon litwick = new Pokemon(607,"Litwick");
static Pokemon lampent = new Pokemon(608,"Lampent");
static Pokemon chandelure = new Pokemon(609,"Chandelure");
static Pokemon axew = new Pokemon(610,"Axew");
static Pokemon fraxure = new Pokemon(611,"Fraxure");
static Pokemon haxorus = new Pokemon(612,"Haxorus");
static Pokemon cubchoo = new Pokemon(613,"Cubchoo");
static Pokemon beartic = new Pokemon(614,"Beartic");
static Pokemon cryogonal = new Pokemon(615,"Cryogonal");
static Pokemon mienfoo = new Pokemon(619,"Mienfoo");
static Pokemon mienshao = new Pokemon(620,"Mienshao");
static Pokemon golett = new Pokemon(622,"Golett");
static Pokemon golurk = new Pokemon(623,"Golurk");
static Pokemon pawniard = new Pokemon(624,"Pawniard");
static Pokemon bisharp = new Pokemon(625,"Bisharp");
static Pokemon rufflet = new Pokemon(627,"Rufflet");
static Pokemon braviary = new Pokemon(628,"Braviary");
static Pokemon vullaby = new Pokemon(629,"Vullaby");
static Pokemon mandibuzz = new Pokemon(630,"Mandibuzz");
static Pokemon deino = new Pokemon(633,"Deino");
static Pokemon zweilous = new Pokemon(634,"Zweilous");
static Pokemon hydreigon = new Pokemon(635,"Hydreigon");
static Pokemon larvesta = new Pokemon(636,"Larvesta");
static Pokemon volcarona = new Pokemon(637,"Volcarona");
static Pokemon cobalion = new Pokemon(638,"Cobalion");
static Pokemon terrakion = new Pokemon(639,"Terrakion");
static Pokemon virizion = new Pokemon(640,"Virizion");
static Pokemon tornadus_incarnate = new Pokemon(641,"Tornadus");
static Pokemon thundurus_incarnate = new Pokemon(642,"Thundurus");
static Pokemon reshiram = new Pokemon(643,"Reshiram");
static Pokemon zekrom = new Pokemon(644,"Zekrom");
static Pokemon landorus_incarnate = new Pokemon(645,"Landorus");
static Pokemon kyurem = new Pokemon(646,"Kyurem");
static Pokemon keldeo_ordinary = new Pokemon(647,"Keldeo");
static Pokemon meloetta_aria = new Pokemon(648,"Meloetta");
static Pokemon chespin = new Pokemon(650,"Chespin");
static Pokemon quilladin = new Pokemon(651,"Quilladin");
static Pokemon chesnaught = new Pokemon(652,"Chesnaught");
static Pokemon fennekin = new Pokemon(653,"Fennekin");
static Pokemon braixen = new Pokemon(654,"Braixen");
static Pokemon delphox = new Pokemon(655,"Delphox");
static Pokemon froakie = new Pokemon(656,"Froakie");
static Pokemon frogadier = new Pokemon(657,"Frogadier");
static Pokemon greninja = new Pokemon(658,"Greninja");
static Pokemon fletchling = new Pokemon(661,"Fletchling");
static Pokemon fletchinder = new Pokemon(662,"Fletchinder");
static Pokemon talonflame = new Pokemon(663,"Talonflame");
static Pokemon scatterbug = new Pokemon(664,"NULL");
static Pokemon spewpa = new Pokemon(665,"NULL");
static Pokemon vivillon = new Pokemon(666,"Vivillon");
static Pokemon litleo = new Pokemon(667,"Litleo");
static Pokemon pyroar = new Pokemon(668,"Pyroar");
static Pokemon flabebe = new Pokemon(669,"FlabÃ©bÃ©");
static Pokemon floette = new Pokemon(670,"Floette");
static Pokemon florges = new Pokemon(671,"Florges");
static Pokemon skiddo = new Pokemon(672,"Skiddo");
static Pokemon gogoat = new Pokemon(673,"Gogoat");
static Pokemon espurr = new Pokemon(677,"Espurr");
static Pokemon meowstic = new Pokemon(678,"Meowstic");
static Pokemon inkay = new Pokemon(686,"Inkay");
static Pokemon malamar = new Pokemon(687,"Malamar");
static Pokemon skrelp = new Pokemon(690,"Skrelp");
static Pokemon dragalge = new Pokemon(691,"Dragalge");
static Pokemon clauncher = new Pokemon(692,"Clauncher");
static Pokemon clawitzer = new Pokemon(693,"Clawitzer");
static Pokemon sylveon = new Pokemon(700,"Sylveon");
static Pokemon hawlucha = new Pokemon(701,"Hawlucha");
static Pokemon dedenne = new Pokemon(702,"Dedenne");
static Pokemon carbink = new Pokemon(703,"Carbink");
static Pokemon goomy = new Pokemon(704,"Goomy");
static Pokemon sliggoo = new Pokemon(705,"Sliggoo");
static Pokemon goodra = new Pokemon(706,"Goodra");
static Pokemon klefki = new Pokemon(707,"Klefki");
static Pokemon phantump = new Pokemon(708,"Phantump");
static Pokemon trevenant = new Pokemon(709,"Trevenant");
static Pokemon bergmite = new Pokemon(712,"Bergmite");
static Pokemon avalugg = new Pokemon(713,"Avalugg");
static Pokemon noibat = new Pokemon(714,"Noibat");
static Pokemon noivern = new Pokemon(715,"Noivern");
static Pokemon diancie = new Pokemon(719,"Diancie");
static Pokemon hoopa = new Pokemon(720,"Hoopa");
static Pokemon volcanion = new Pokemon(721,"Volcanion");
static Pokemon rowlet = new Pokemon(722,"Rowlet");
static Pokemon dartrix = new Pokemon(723,"Dartrix");
static Pokemon decidueye = new Pokemon(724,"Decidueye");
static Pokemon litten = new Pokemon(725,"Litten");
static Pokemon torracat = new Pokemon(726,"Torracat");
static Pokemon incineroar = new Pokemon(727,"Incineroar");
static Pokemon popplio = new Pokemon(728,"Popplio");
static Pokemon brionne = new Pokemon(729,"Brionne");
static Pokemon primarina = new Pokemon(730,"Primarina");
static Pokemon pikipek = new Pokemon(731,"Pikipek");
static Pokemon trumbeak = new Pokemon(732,"Trumbeak");
static Pokemon toucannon = new Pokemon(733,"Toucannon");
static Pokemon yungoos = new Pokemon(734,"Yungoos");
static Pokemon gumshoos = new Pokemon(735,"Gumshoos");
static Pokemon grubbin = new Pokemon(736,"Grubbin");
static Pokemon charjabug = new Pokemon(737,"Charjabug");
static Pokemon vikavolt = new Pokemon(738,"Vikavolt");
static Pokemon crabrawler = new Pokemon(739,"Crabrawler");
static Pokemon crabominable = new Pokemon(740,"Crabominable");
static Pokemon oricorio_baile = new Pokemon(741,"Oricorio");
static Pokemon cutiefly = new Pokemon(742,"Cutiefly");
static Pokemon ribombee = new Pokemon(743,"Ribombee");
static Pokemon rockruff = new Pokemon(744,"Rockruff");
static Pokemon lycanroc_midday = new Pokemon(745,"Lycanroc");
static Pokemon mareanie = new Pokemon(747,"Mareanie");
static Pokemon toxapex = new Pokemon(748,"Toxapex");
static Pokemon mudbray = new Pokemon(749,"Mudbray");
static Pokemon mudsdale = new Pokemon(750,"Mudsdale");
static Pokemon dewpider = new Pokemon(751,"Dewpider");
static Pokemon araquanid = new Pokemon(752,"Araquanid");
static Pokemon fomantis = new Pokemon(753,"Fomantis");
static Pokemon lurantis = new Pokemon(754,"Lurantis");
static Pokemon salandit = new Pokemon(757,"Salandit");
static Pokemon salazzle = new Pokemon(758,"Salazzle");
static Pokemon bounsweet = new Pokemon(761,"Bounsweet");
static Pokemon steenee = new Pokemon(762,"Steenee");
static Pokemon tsareena = new Pokemon(763,"Tsareena");
static Pokemon comfey = new Pokemon(764,"Comfey");
static Pokemon oranguru = new Pokemon(765,"Oranguru");
static Pokemon passimian = new Pokemon(766,"Passimian");
static Pokemon sandygast = new Pokemon(769,"Sandygast");
static Pokemon palossand = new Pokemon(770,"Palossand");
static Pokemon minior = new Pokemon(774,"Minior");
static Pokemon komala = new Pokemon(775,"Komala");
static Pokemon mimikyu = new Pokemon(778,"Mimikyu");
static Pokemon bruxish = new Pokemon(779,"Bruxish");
static Pokemon jangmo_o = new Pokemon(782,"Jangmo-o");
static Pokemon hakamo_o = new Pokemon(783,"Hakamo-o");
static Pokemon kommo_o = new Pokemon(784,"Kommo-o");
static Pokemon cosmog = new Pokemon(789,"Cosmog");
static Pokemon cosmoem = new Pokemon(790,"Cosmoem");
static Pokemon solgaleo = new Pokemon(791,"Solgaleo");
static Pokemon lunala = new Pokemon(792,"Lunala");
static Pokemon necrozma = new Pokemon(800,"Necrozma");
static Pokemon magearna = new Pokemon(801,"Magearna");
static Pokemon grookey = new Pokemon(810,"Grookey");
static Pokemon thwackey = new Pokemon(811,"Thwackey");
static Pokemon rillaboom = new Pokemon(812,"Rillaboom");
static Pokemon scorbunny = new Pokemon(813,"Scorbunny");
static Pokemon raboot = new Pokemon(814,"Raboot");
static Pokemon cinderace = new Pokemon(815,"Cinderace");
static Pokemon sobble = new Pokemon(816,"Sobble");
static Pokemon drizzile = new Pokemon(817,"Drizzile");
static Pokemon inteleon = new Pokemon(818,"Inteleon");
static Pokemon skwovet = new Pokemon(819,"Skwovet");
static Pokemon greedent = new Pokemon(820,"Greedent");
static Pokemon rookidee = new Pokemon(821,"Rookidee");
static Pokemon corvisquire = new Pokemon(822,"Corvisquire");
static Pokemon corviknight = new Pokemon(823,"Corviknight");
static Pokemon chewtle = new Pokemon(833,"Chewtle");
static Pokemon drednaw = new Pokemon(834,"Drednaw");
static Pokemon rolycoly = new Pokemon(837,"Rolycoly");
static Pokemon carkol = new Pokemon(838,"Carkol");
static Pokemon coalossal = new Pokemon(839,"Coalossal");
static Pokemon applin = new Pokemon(840,"Applin");
static Pokemon flapple = new Pokemon(841,"Flapple");
static Pokemon appletun = new Pokemon(842,"Appletun");
static Pokemon silicobra = new Pokemon(843,"Silicobra");
static Pokemon sandaconda = new Pokemon(844,"Sandaconda");
static Pokemon cramorant = new Pokemon(845,"Cramorant");
static Pokemon arrokuda = new Pokemon(846,"Arrokuda");
static Pokemon barraskewda = new Pokemon(847,"Barraskewda");
static Pokemon toxel = new Pokemon(848,"Toxel");
static Pokemon toxtricity_amped = new Pokemon(849,"Toxtricity");
static Pokemon sinistea = new Pokemon(854,"Sinistea");
static Pokemon polteageist = new Pokemon(855,"Polteageist");
static Pokemon hatenna = new Pokemon(856,"Hatenna");
static Pokemon hattrem = new Pokemon(857,"Hattrem");
static Pokemon hatterene = new Pokemon(858,"Hatterene");
static Pokemon impidimp = new Pokemon(859,"Impidimp");
static Pokemon morgrem = new Pokemon(860,"Morgrem");
static Pokemon grimmsnarl = new Pokemon(861,"Grimmsnarl");
static Pokemon perrserker = new Pokemon(863,"Perrserker");
static Pokemon milcery = new Pokemon(868,"Milcery");
static Pokemon alcremie = new Pokemon(869,"Alcremie");
static Pokemon falinks = new Pokemon(870,"Falinks");
static Pokemon pincurchin = new Pokemon(871,"Pincurchin");
static Pokemon snom = new Pokemon(872,"Snom");
static Pokemon frosmoth = new Pokemon(873,"Frosmoth");
static Pokemon stonjourner = new Pokemon(874,"Stonjourner");
static Pokemon eiscue = new Pokemon(875,"Eiscue");
static Pokemon indeedee = new Pokemon(876,"Indeedee");
static Pokemon morpeko = new Pokemon(877,"Morpeko");
static Pokemon cufant = new Pokemon(878,"Cufant");
static Pokemon copperajah = new Pokemon(879,"Copperajah");
static Pokemon duraludon = new Pokemon(884,"Duraludon");
static Pokemon dreepy = new Pokemon(885,"Dreepy");
static Pokemon drakloak = new Pokemon(886,"Drakloak");
static Pokemon dragapult = new Pokemon(887,"Dragapult");
static Pokemon zacian = new Pokemon(888,"Zacian");
static Pokemon zamazenta = new Pokemon(889,"Zamazenta");
static Pokemon eternatus = new Pokemon(890,"Eternatus");
static Pokemon kubfu = new Pokemon(891,"Kubfu");
static Pokemon urshifu_single_strike = new Pokemon(892,"Urshifu");
static Pokemon zarude = new Pokemon(893,"Zarude");
static Pokemon regieleki = new Pokemon(894,"Regieleki");
static Pokemon regidrago = new Pokemon(895,"Regidrago");
static Pokemon glastrier = new Pokemon(896,"Glastrier");
static Pokemon spectrier = new Pokemon(897,"Spectrier");
static Pokemon calyrex = new Pokemon(898,"Calyrex");
static Pokemon wyrdeer = new Pokemon(899,"Wyrdeer");
static Pokemon kleavor = new Pokemon(900,"Kleavor");
static Pokemon ursaluna = new Pokemon(901,"Ursaluna");
static Pokemon basculegion = new Pokemon(902,"Basculegion");
static Pokemon sneasler = new Pokemon(903,"Sneasler");
static Pokemon overqwil = new Pokemon(904,"Overqwil");
static Pokemon enamorus_incarnate = new Pokemon(905,"Enamorus");
static Pokemon sprigatito = new Pokemon(906,"Sprigatito");
static Pokemon floragato = new Pokemon(907,"Floragato");
static Pokemon meowscarada = new Pokemon(908,"Meowscarada");
static Pokemon fuecoco = new Pokemon(909,"Fuecoco");
static Pokemon crocalor = new Pokemon(910,"Crocalor");
static Pokemon skeledirge = new Pokemon(911,"Skeledirge");
static Pokemon quaxly = new Pokemon(912,"Quaxly");
static Pokemon quaxwell = new Pokemon(913,"Quaxwell");
static Pokemon quaquaval = new Pokemon(914,"Quaquaval");
static Pokemon lechonk = new Pokemon(915,"Lechonk");
static Pokemon oinkologne = new Pokemon(916,"Oinkologne");
static Pokemon tarountula = new Pokemon(917,"Tarountula");
static Pokemon spidops = new Pokemon(918,"Spidops");
static Pokemon nymble = new Pokemon(919,"Nymble");
static Pokemon lokix = new Pokemon(920,"Lokix");
static Pokemon pawmi = new Pokemon(921,"Pawmi");
static Pokemon pawmo = new Pokemon(922,"Pawmo");
static Pokemon pawmot = new Pokemon(923,"Pawmot");
static Pokemon tandemaus = new Pokemon(924,"Tandemaus");
static Pokemon maushold = new Pokemon(925,"Maushold");
static Pokemon fidough = new Pokemon(926,"Fidough");
static Pokemon dachsbun = new Pokemon(927,"Dachsbun");
static Pokemon smoliv = new Pokemon(928,"Smoliv");
static Pokemon dolliv = new Pokemon(929,"Dolliv");
static Pokemon arboliva = new Pokemon(930,"Arboliva");
static Pokemon squawkabilly = new Pokemon(931,"Squawkabilly");
static Pokemon nacli = new Pokemon(932,"Nacli");
static Pokemon naclstack = new Pokemon(933,"Naclstack");
static Pokemon garganacl = new Pokemon(934,"Garganacl");
static Pokemon charcadet = new Pokemon(935,"Charcadet");
static Pokemon armarouge = new Pokemon(936,"Armarouge");
static Pokemon ceruledge = new Pokemon(937,"Ceruledge");
static Pokemon tadbulb = new Pokemon(938,"Tadbulb");
static Pokemon bellibolt = new Pokemon(939,"Bellibolt");
static Pokemon wattrel = new Pokemon(940,"Wattrel");
static Pokemon kilowattrel = new Pokemon(941,"Kilowattrel");
static Pokemon maschiff = new Pokemon(942,"Maschiff");
static Pokemon mabosstiff = new Pokemon(943,"Mabosstiff");
static Pokemon shroodle = new Pokemon(944,"Shroodle");
static Pokemon grafaiai = new Pokemon(945,"Grafaiai");
static Pokemon bramblin = new Pokemon(946,"Bramblin");
static Pokemon brambleghast = new Pokemon(947,"Brambleghast");
static Pokemon toedscool = new Pokemon(948,"Toedscool");
static Pokemon toedscruel = new Pokemon(949,"Toedscruel");
static Pokemon klawf = new Pokemon(950,"Klawf");
static Pokemon capsakid = new Pokemon(951,"Capsakid");
static Pokemon scovillain = new Pokemon(952,"Scovillain");
static Pokemon rellor = new Pokemon(953,"Rellor");
static Pokemon rabsca = new Pokemon(954,"Rabsca");
static Pokemon flittle = new Pokemon(955,"Flittle");
static Pokemon espathra = new Pokemon(956,"Espathra");
static Pokemon tinkatink = new Pokemon(957,"Tinkatink");
static Pokemon tinkatuff = new Pokemon(958,"Tinkatuff");
static Pokemon tinkaton = new Pokemon(959,"Tinkaton");
static Pokemon wiglett = new Pokemon(960,"Wiglett");
static Pokemon wugtrio = new Pokemon(961,"Wugtrio");
static Pokemon bombirdier = new Pokemon(962,"Bombirdier");
static Pokemon finizen = new Pokemon(963,"Finizen");
static Pokemon palafin = new Pokemon(964,"Palafin");
static Pokemon varoom = new Pokemon(965,"Varoom");
static Pokemon revavroom = new Pokemon(966,"Revavroom");
static Pokemon cyclizar = new Pokemon(967,"Cyclizar");
static Pokemon orthworm = new Pokemon(968,"Orthworm");
static Pokemon glimmet = new Pokemon(969,"Glimmet");
static Pokemon glimmora = new Pokemon(970,"Glimmora");
static Pokemon greavard = new Pokemon(971,"Greavard");
static Pokemon houndstone = new Pokemon(972,"Houndstone");
static Pokemon flamigo = new Pokemon(973,"Flamigo");
static Pokemon cetoddle = new Pokemon(974,"Cetoddle");
static Pokemon cetitan = new Pokemon(975,"Cetitan");
static Pokemon veluza = new Pokemon(976,"Veluza");
static Pokemon dondozo = new Pokemon(977,"Dondozo");
static Pokemon tatsugiri = new Pokemon(978,"Tatsugiri");
static Pokemon annihilape = new Pokemon(979,"Annihilape");
static Pokemon clodsire = new Pokemon(980,"Clodsire");
static Pokemon farigiraf = new Pokemon(981,"Farigiraf");
static Pokemon dudunsparce = new Pokemon(982,"Dudunsparce");
static Pokemon kingambit = new Pokemon(983,"Kingambit");
static Pokemon great_tusk = new Pokemon(984,"Great Tusk");
static Pokemon scream_tail = new Pokemon(985,"Scream Tail");
static Pokemon brute_bonnet = new Pokemon(986,"Brute Bonnet");
static Pokemon flutter_mane = new Pokemon(987,"Flutter Mane");
static Pokemon slither_wing = new Pokemon(988,"Slither Wing");
static Pokemon sandy_shocks = new Pokemon(989,"Sandy Shocks");
static Pokemon iron_treads = new Pokemon(990,"Iron Treads");
static Pokemon iron_bundle = new Pokemon(991,"Iron Bundle");
static Pokemon iron_hands = new Pokemon(992,"Iron Hands");
static Pokemon iron_jugulis = new Pokemon(993,"Iron Jugulis");
static Pokemon iron_moth = new Pokemon(994,"Iron Moth");
static Pokemon iron_thorns = new Pokemon(995,"Iron Thorns");
static Pokemon frigibax = new Pokemon(996,"Frigibax");
static Pokemon arctibax = new Pokemon(997,"Arctibax");
static Pokemon baxcalibur = new Pokemon(998,"Baxcalibur");
static Pokemon gimmighoul = new Pokemon(999,"Gimmighoul");
static Pokemon gholdengo = new Pokemon(1000,"Gholdengo");
static Pokemon wo_chien = new Pokemon(1001,"Wo-Chien");
static Pokemon chien_pao = new Pokemon(1002,"Chien-Pao");
static Pokemon ting_lu = new Pokemon(1003,"Ting-Lu");
static Pokemon chi_yu = new Pokemon(1004,"Chi-Yu");
static Pokemon roaring_moon = new Pokemon(1005,"Roaring Moon");
static Pokemon iron_valiant = new Pokemon(1006,"Iron Valiant");
static Pokemon koraidon = new Pokemon(1007,"Koraidon");
static Pokemon miraidon = new Pokemon(1008,"Miraidon");
static Pokemon walking_wake = new Pokemon(1009,"Walking Wake");
static Pokemon iron_leaves = new Pokemon(1010,"Iron Leaves");
static Pokemon dipplin = new Pokemon(1011,"Dipplin");
static Pokemon poltchageist = new Pokemon(1012,"Poltchageist");
static Pokemon sinistcha = new Pokemon(1013,"Sinistcha");
static Pokemon okidogi = new Pokemon(1014,"Okidogi");
static Pokemon munkidori = new Pokemon(1015,"Munkidori");
static Pokemon fezandipiti = new Pokemon(1016,"Fezandipiti");
static Pokemon ogerpon = new Pokemon(1017,"Ogerpon");
static Pokemon archaludon = new Pokemon(1018,"Archaludon");
static Pokemon hydrapple = new Pokemon(1019,"Hydrapple");
static Pokemon gouging_fire = new Pokemon(1020,"Gouging Fire");
static Pokemon raging_bolt = new Pokemon(1021,"Raging Bolt");
static Pokemon iron_boulder = new Pokemon(1022,"Iron Boulder");
static Pokemon iron_crown = new Pokemon(1023,"Iron Crown");
static Pokemon terapagos = new Pokemon(1024,"Terapagos");
static Pokemon pecharunt = new Pokemon(1025,"Pecharunt");
static Pokemon deoxys_attack = new Pokemon(10001,"Attack Deoxys");
static Pokemon deoxys_defense = new Pokemon(10002,"Defense Deoxys");
static Pokemon deoxys_speed = new Pokemon(10003,"Speed Deoxys");
static Pokemon shaymin_sky = new Pokemon(10006,"Sky Shaymin");
static Pokemon giratina_origin = new Pokemon(10007,"Origin Giratina");
static Pokemon rotom_heat = new Pokemon(10008,"Heat Rotom");
static Pokemon rotom_wash = new Pokemon(10009,"Wash Rotom");
static Pokemon rotom_frost = new Pokemon(10010,"Frost Rotom");
static Pokemon rotom_fan = new Pokemon(10011,"Fan Rotom");
static Pokemon rotom_mow = new Pokemon(10012,"Mow Rotom");
static Pokemon tornadus_therian = new Pokemon(10019,"Therian Tornadus");
static Pokemon thundurus_therian = new Pokemon(10020,"Therian Thundurus");
static Pokemon landorus_therian = new Pokemon(10021,"Therian Landorus");
static Pokemon kyurem_black = new Pokemon(10022,"Black Kyurem");
static Pokemon kyurem_white = new Pokemon(10023,"White Kyurem");
static Pokemon keldeo_resolute = new Pokemon(10024,"Resolute Keldeo");
static Pokemon hoopa_unbound = new Pokemon(10086,"Hoopa Unbound");
static Pokemon raichu_alola = new Pokemon(10100,"Alolan Raichu");
static Pokemon sandshrew_alola = new Pokemon(10101,"Alolan Sandshrew");
static Pokemon sandslash_alola = new Pokemon(10102,"Alolan Sandslash");
static Pokemon vulpix_alola = new Pokemon(10103,"Alolan Vulpix");
static Pokemon ninetales_alola = new Pokemon(10104,"Alolan Ninetales");
static Pokemon diglett_alola = new Pokemon(10105,"Alolan Diglett");
static Pokemon dugtrio_alola = new Pokemon(10106,"Alolan Dugtrio");
static Pokemon meowth_alola = new Pokemon(10107,"Alolan Meowth");
static Pokemon persian_alola = new Pokemon(10108,"Alolan Persian");
static Pokemon geodude_alola = new Pokemon(10109,"Alolan Geodude");
static Pokemon graveler_alola = new Pokemon(10110,"Alolan Graveler");
static Pokemon golem_alola = new Pokemon(10111,"Alolan Golem");
static Pokemon grimer_alola = new Pokemon(10112,"Alolan Grimer");
static Pokemon muk_alola = new Pokemon(10113,"Alolan Muk");
static Pokemon exeggutor_alola = new Pokemon(10114,"Alolan Exeggutor");
static Pokemon oricorio_pom_pom = new Pokemon(10123,"Pom-pom Oricorio");
static Pokemon oricorio_pau = new Pokemon(10124,"Paâ€™u Oricorio");
static Pokemon oricorio_sensu = new Pokemon(10125,"Sensu Oricorio");
static Pokemon lycanroc_midnight = new Pokemon(10126,"Midnight Lycanroc");
static Pokemon lycanroc_dusk = new Pokemon(10152,"Dusk Lycanroc");
static Pokemon necrozma_dusk = new Pokemon(10155,"Dusk Necrozma");
static Pokemon necrozma_dawn = new Pokemon(10156,"Dawn Necrozma");
static Pokemon meowth_galar = new Pokemon(10161,"Galarian Meowth");
static Pokemon slowpoke_galar = new Pokemon(10164,"Galarian Slowpoke");
static Pokemon slowbro_galar = new Pokemon(10165,"Galarian Slowbro");
static Pokemon weezing_galar = new Pokemon(10167,"Galarian Weezing");
static Pokemon articuno_galar = new Pokemon(10169,"Galarian Articuno");
static Pokemon zapdos_galar = new Pokemon(10170,"Galarian Zapdos");
static Pokemon moltres_galar = new Pokemon(10171,"Galarian Moltres");
static Pokemon slowking_galar = new Pokemon(10172,"Galarian Slowking");
static Pokemon toxtricity_low_key = new Pokemon(10184,"Low Key Toxtricity");
static Pokemon urshifu_rapid_strike = new Pokemon(10191,"Rapid Strike Urshifu");
static Pokemon calyrex_ice = new Pokemon(10193,"Ice Calyrex");
static Pokemon calyrex_shadow = new Pokemon(10194,"Shadow Calyrex");
static Pokemon growlithe_hisui = new Pokemon(10229,"Hisuian Growlithe");
static Pokemon arcanine_hisui = new Pokemon(10230,"Hisuian Arcanine");
static Pokemon voltorb_hisui = new Pokemon(10231,"Hisuian Voltorb");
static Pokemon electrode_hisui = new Pokemon(10232,"Hisuian Electrode");
static Pokemon typhlosion_hisui = new Pokemon(10233,"Hisuian Typhlosion");
static Pokemon qwilfish_hisui = new Pokemon(10234,"Hisuian Qwilfish");
static Pokemon sneasel_hisui = new Pokemon(10235,"Hisuian Sneasel");
static Pokemon samurott_hisui = new Pokemon(10236,"Hisuian Samurott");
static Pokemon lilligant_hisui = new Pokemon(10237,"Hisuian Lilligant");
static Pokemon zorua_hisui = new Pokemon(10238,"Hisuian Zorua");
static Pokemon zoroark_hisui = new Pokemon(10239,"Hisuian Zoroark");
static Pokemon braviary_hisui = new Pokemon(10240,"Hisuian Braviary");
static Pokemon sliggoo_hisui = new Pokemon(10241,"Hisuian Sliggoo");
static Pokemon goodra_hisui = new Pokemon(10242,"Hisuian Goodra");
static Pokemon avalugg_hisui = new Pokemon(10243,"Hisuian Avalugg");
static Pokemon decidueye_hisui = new Pokemon(10244,"Hisuian Decidueye");
static Pokemon dialga_origin = new Pokemon(10245,"Origin Dialga");
static Pokemon palkia_origin = new Pokemon(10246,"Origin Palkia");
static Pokemon basculin_white_striped = new Pokemon(10247,"White-Striped Basculin");
static Pokemon enamorus_therian = new Pokemon(10249,"Therian Enamorus");
static Pokemon tauros_paldea_combat_breed = new Pokemon(10250,"Paldean Tauros (Combat Breed)");
static Pokemon tauros_paldea_blaze_breed = new Pokemon(10251,"Paldean Tauros (Blaze Breed)");
static Pokemon tauros_paldea_aqua_breed = new Pokemon(10252,"Paldean Tauros (Aqua Breed)");
static Pokemon wooper_paldea = new Pokemon(10253,"Paldean Wooper");
static Pokemon ursaluna_bloodmoon = new Pokemon(10272,"Bloodmoon Ursaluna");
static Pokemon ogerpon_wellspring_mask = new Pokemon(10273,"Wellspring Mask Ogerpon");
static Pokemon ogerpon_hearthflame_mask = new Pokemon(10274,"Hearthflame Mask Ogerpon");
static Pokemon ogerpon_cornerstone_mask = new Pokemon(10275,"Cornerstone Mask Ogerpon");



        Pokemon[] gen9Pokedex = {bulbasaur, ivysaur, venusaur, charmander, charmeleon, charizard, squirtle, wartortle, blastoise, ekans, arbok, pikachu, raichu, sandshrew, sandslash, clefairy, 
            clefable, vulpix, ninetales, jigglypuff, wigglytuff, oddish, gloom, vileplume, venonat, venomoth, diglett, dugtrio, meowth, persian, psyduck, golduck, mankey, primeape, growlithe, 
            arcanine, poliwag, poliwhirl, poliwrath, bellsprout, weepinbell, victreebel, tentacool, tentacruel, geodude, graveler, golem, slowpoke, slowbro, magnemite, magneton, doduo, dodrio, seel, 
            dewgong, grimer, muk, shellder, cloyster, gastly, haunter, gengar, drowzee, hypno, voltorb, electrode, exeggcute, exeggutor, hitmonlee, hitmonchan, koffing, weezing, rhyhorn, rhydon, chansey, 
            horsea, seadra, scyther, electabuzz, magmar, tauros, magikarp, gyarados, lapras, ditto, eevee, vaporeon, jolteon, flareon, porygon, snorlax, articuno, zapdos, moltres, dratini, dragonair, dragonite, 
            mewtwo, mew, chikorita, bayleef, meganium, cyndaquil, quilava, typhlosion, totodile, croconaw, feraligatr, sentret, furret, hoothoot, noctowl, spinarak, ariados, chinchou, lanturn, pichu, 
            cleffa, igglybuff, mareep, flaaffy, ampharos, bellossom, marill, azumarill, sudowoodo, politoed, hoppip, skiploom, jumpluff, aipom, sunkern, sunflora, yanma, wooper, quagsire, espeon, 
            umbreon, murkrow, slowking, misdreavus, girafarig, pineco, forretress, dunsparce, gligar, snubbull, granbull, qwilfish, scizor, heracross, sneasel, teddiursa, ursaring, slugma, magcargo, 
            swinub, piloswine, delibird, skarmory, houndour, houndoom, kingdra, phanpy, donphan, porygon2, stantler, smeargle, tyrogue, hitmontop, elekid, magby, blissey, raikou, entei, suicune, larvitar, 
            pupitar, tyranitar, lugia, ho_oh, treecko, grovyle, sceptile, torchic, combusken, blaziken, mudkip, marshtomp, swampert, poochyena, mightyena, lotad, lombre, ludicolo, seedot, nuzleaf, shiftry, 
            wingull, pelipper, ralts, kirlia, gardevoir, surskit, masquerain, shroomish, breloom, slakoth, vigoroth, slaking, makuhita, hariyama, azurill, nosepass, sableye, meditite, medicham, plusle, minun, 
            volbeat, illumise, gulpin, swalot, numel, camerupt, torkoal, spoink, grumpig, trapinch, vibrava, flygon, cacnea, cacturne, swablu, altaria, zangoose, seviper, barboach, whiscash, corphish, crawdaunt, 
            feebas, milotic, shuppet, banette, duskull, dusclops, tropius, chimecho, snorunt, glalie, luvdisc, bagon, shelgon, salamence, beldum, metang, metagross, regirock, regice, registeel, latias, 
            latios, kyogre, groudon, rayquaza, jirachi, deoxys, turtwig, grotle, torterra, chimchar, monferno, infernape, piplup, prinplup, empoleon, starly, staravia, staraptor, kricketot, 
            kricketune, shinx, luxio, luxray, cranidos, rampardos, shieldon, bastiodon, combee, vespiquen, pachirisu, buizel, floatzel, shellos, gastrodon, ambipom, drifloon, drifblim, mismagius, 
            honchkrow, chingling, stunky, skuntank, bronzor, bronzong, bonsly, happiny, spiritomb, gible, gabite, garchomp, munchlax, riolu, lucario, hippopotas, hippowdon, croagunk, toxicroak, 
            finneon, lumineon, snover, abomasnow, weavile, magnezone, rhyperior, electivire, magmortar, yanmega, leafeon, glaceon, gliscor, mamoswine, porygon_z, gallade, probopass, dusknoir, 
            froslass, rotom, uxie, mesprit, azelf, dialga, palkia, heatran, regigigas, giratina_altered, cresselia, phione, manaphy, darkrai, shaymin_land, arceus, snivy, servine, serperior, 
            tepig, pignite, emboar, oshawott, dewott, samurott, blitzle, zebstrika, drilbur, excadrill, timburr, gurdurr, conkeldurr, sewaddle, swadloon, leavanny, cottonee, whimsicott, petilil, 
            lilligant, basculin, sandile, krokorok, krookodile, scraggy, scrafty, zorua, zoroark, minccino, cinccino, gothita, gothorita, gothitelle, solosis, duosion, reuniclus, ducklett, 
            swanna, deerling, sawsbuck, foongus, amoonguss, alomomola, joltik, galvantula, tynamo, eelektrik, eelektross, litwick, lampent, chandelure, axew, fraxure, haxorus, cubchoo, beartic, cryogonal, 
            mienfoo, mienshao, golett, golurk, pawniard, bisharp, rufflet, braviary, vullaby, mandibuzz, deino, zweilous, hydreigon, larvesta, volcarona, cobalion, terrakion, virizion, tornadus_incarnate, 
            thundurus_incarnate, reshiram, zekrom, landorus_incarnate, kyurem, keldeo_ordinary, meloetta_aria, chespin, quilladin, chesnaught, fennekin, braixen, delphox, froakie, frogadier, greninja, 
            fletchling, fletchinder, talonflame, scatterbug, spewpa, vivillon, litleo, pyroar, flabebe, floette, florges, skiddo, gogoat, espurr, meowstic, inkay, malamar, skrelp, dragalge, 
            clauncher, clawitzer, sylveon, hawlucha, dedenne, carbink, goomy, sliggoo, goodra, klefki, phantump, trevenant, bergmite, avalugg, noibat, noivern, diancie, hoopa, volcanion, rowlet, dartrix, 
            decidueye, litten, torracat, incineroar, popplio, brionne, primarina, pikipek, trumbeak, toucannon, yungoos, gumshoos, grubbin, charjabug, vikavolt, crabrawler, crabominable, oricorio_baile, 
            cutiefly, ribombee, rockruff, lycanroc_midday, mareanie, toxapex, mudbray, mudsdale, dewpider, araquanid, fomantis, lurantis, salandit, salazzle, bounsweet, steenee, tsareena, comfey, oranguru, 
            passimian, sandygast, palossand, minior, komala, mimikyu, bruxish, jangmo_o, hakamo_o, kommo_o, cosmog, cosmoem, solgaleo, lunala, necrozma, magearna, grookey, thwackey, 
            rillaboom, scorbunny, raboot, cinderace, sobble, drizzile, inteleon, skwovet, greedent, rookidee, corvisquire, corviknight, chewtle, drednaw, rolycoly, carkol, coalossal, applin, flapple, 
            appletun, silicobra, sandaconda, cramorant, arrokuda, barraskewda, toxel, toxtricity_amped, sinistea, polteageist, hatenna, hattrem, hatterene, impidimp, morgrem, grimmsnarl, perrserker, 
            milcery, alcremie, falinks, pincurchin, snom, frosmoth, stonjourner, eiscue, indeedee, morpeko, cufant, copperajah, duraludon, dreepy, drakloak, dragapult, zacian, 
            zamazenta, eternatus, kubfu, urshifu_single_strike, zarude, regieleki, regidrago, glastrier, spectrier, calyrex, wyrdeer, kleavor, ursaluna, basculegion, sneasler, overqwil, 
            enamorus_incarnate, sprigatito, floragato, meowscarada, fuecoco, crocalor, skeledirge, quaxly, quaxwell, quaquaval, lechonk, oinkologne, tarountula, spidops, nymble, lokix, 
            pawmi, pawmo, pawmot, tandemaus, maushold, fidough, dachsbun, smoliv, dolliv, arboliva, squawkabilly, nacli, naclstack, garganacl, charcadet, armarouge, 
            ceruledge, tadbulb, bellibolt, wattrel, kilowattrel, maschiff, mabosstiff, shroodle, grafaiai, bramblin, brambleghast, toedscool, toedscruel, klawf, capsakid, scovillain, rellor, 
            rabsca, flittle, espathra, tinkatink, tinkatuff, tinkaton, wiglett, wugtrio, bombirdier, finizen, palafin, varoom, revavroom, cyclizar, orthworm, glimmet, glimmora, greavard, 
            houndstone, flamigo, cetoddle, cetitan, veluza, dondozo, tatsugiri, annihilape, clodsire, farigiraf, dudunsparce, kingambit, great_tusk, scream_tail, brute_bonnet, 
            flutter_mane, slither_wing, sandy_shocks, iron_treads, iron_bundle, iron_hands, iron_jugulis, iron_moth, iron_thorns, frigibax, arctibax, baxcalibur, gimmighoul, gholdengo, wo_chien, 
            chien_pao, ting_lu, chi_yu, roaring_moon, iron_valiant, koraidon, miraidon, walking_wake, iron_leaves, dipplin, poltchageist, sinistcha, okidogi, munkidori, fezandipiti, ogerpon, archaludon, 
            hydrapple, gouging_fire, raging_bolt, iron_boulder, iron_crown, terapagos, pecharunt, deoxys_attack, deoxys_defense, deoxys_speed, shaymin_sky, giratina_origin, rotom_heat, rotom_wash, 
            rotom_frost, rotom_fan, rotom_mow, tornadus_therian, thundurus_therian, landorus_therian, kyurem_black, kyurem_white, keldeo_resolute, 
            hoopa_unbound, raichu_alola, sandshrew_alola, sandslash_alola, vulpix_alola, ninetales_alola, diglett_alola, dugtrio_alola, meowth_alola, persian_alola, geodude_alola, 
            graveler_alola, golem_alola, grimer_alola, muk_alola, exeggutor_alola, oricorio_pom_pom, oricorio_pau, oricorio_sensu, lycanroc_midnight, 
            lycanroc_dusk, necrozma_dusk, necrozma_dawn, meowth_galar, slowpoke_galar, slowbro_galar, weezing_galar, articuno_galar, 
            zapdos_galar, moltres_galar, slowking_galar, toxtricity_low_key, zacian, zamazenta, urshifu_rapid_strike,  
            calyrex_ice, calyrex_shadow, growlithe_hisui, arcanine_hisui, voltorb_hisui, electrode_hisui, typhlosion_hisui, qwilfish_hisui, sneasel_hisui, samurott_hisui, lilligant_hisui, 
            zorua_hisui, zoroark_hisui, braviary_hisui, sliggoo_hisui, goodra_hisui, avalugg_hisui, decidueye_hisui, dialga_origin, palkia_origin, basculin_white_striped,  
            enamorus_therian, tauros_paldea_combat_breed, tauros_paldea_blaze_breed, tauros_paldea_aqua_breed, wooper_paldea, ursaluna_bloodmoon, 
            ogerpon_wellspring_mask, ogerpon_hearthflame_mask, ogerpon_cornerstone_mask, terapagos
        };
                         

    Pokemon[] gen10Pokedex = {};

    Pokemon[] testPokedex = {bulbasaur, ivysaur, venusaur};

        Pokedex() {

        }
    //change this to change the pokedex
    Pokemon[] pokedex = gen9Pokedex;

    int name_index1 = random.nextInt(pokedex.length);
    int name_index2 = random.nextInt(pokedex.length);
    int name_index3 = random.nextInt(pokedex.length);

    public void again(){
        name_index1 = random.nextInt(pokedex.length);
        name_index2 = random.nextInt(pokedex.length);
        name_index3 = random.nextInt(pokedex.length);
    }
    public Pokemon[] getPokedex() {
        return pokedex;
    }
    public Text getName(int index) {
        Text text = new Text(pokedex[index].name);
        return text;
    }
    public Text getHeight(int index) {
        Text text = new Text(pokedex[index].height);
        return text;
    }
    public Text getWeight(int index) {
        Text text = new Text(pokedex[index].weight);
        return text;
    }
    public Text getNumber(int index) {
        Text text = new Text(Integer.toString(pokedex[index].number));
        return text;
    }
    public Text getJapaneseName(int index) {
        Text text = new Text(pokedex[index].japanese);
        return text;
    }
    public Image getNormalImage(int index) {
        return pokedex[index].getNormalImage();
    }
    public Image getShiny(int index) {
        return pokedex[index].getShinyImage();
    }
    public Text getSpecies(int index) {
        return new Text(pokedex[index].getSpecies());
    }
    public String getHighestStat(int index) {
        return pokedex[index].getHighestStat();

    }
    public String getLowestStat(int index) {
        return pokedex[index].getLowestStat();
    }

    // method for sorting stats
    public ArrayList<String> sortedStats(LinkedHashMap<String, Integer> stats) {
        ArrayList<String> sortedStats = new ArrayList<>();
        for (String key: stats.keySet()) {
            if (sortedStats.isEmpty()) {
                sortedStats.add(key);
            }
            else {
                boolean larger = true;
                for (int i = 0; i < sortedStats.size(); i++) {
                    if (stats.get(key) < stats.get(sortedStats.get(i))) {
                        sortedStats.add(i, key);
                        larger = false;
                        break;
                    }
                }
                if (larger) {
                    sortedStats.add(key);
                }
            }
        }
        return sortedStats;
    }

    // method that initializes the stats of the pokemon in the active pokedex
    public void initPokedex() {
                String filePath = "Database\\merged_database.csv";

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
            ArrayList<String[]> attributes = new ArrayList<>();
            // skip the header of the of the csv
            fileReader.readLine();
            String line = "";
            int index = 1025;

            // load a 2d array with the stats of all pokemon
            while((line = fileReader.readLine()) != null) {
                attributes.add(line.split(",", 18));
            }
            // initilize the stats of the pokemon in the current pokedex
            for (Pokemon pokemon : pokedex) {
                // if the pokemon is the standard form, its stats are located at index = {id} - 1
                if (pokemon.getId() < 10000) {
                    pokemon.initStats(attributes.get(pokemon.getId() - 1));
                }
                // if its id > 100000 then who knows where it is
                else {
                    while (Integer.parseInt(attributes.get(index)[0]) != pokemon.getId()) {
                        index++;
                    }
                    pokemon.initStats(attributes.get(index));
                }
            }

            fileReader.close();
        } catch (Exception e) {
            System.out.println("error reading file: " + e.getMessage());
        }

    }

}
