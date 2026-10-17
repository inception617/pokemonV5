package com.example;

import javafx.scene.image.Image;
import javafx.scene.text.Text;
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
    
static Pokemon Bulbasaur = new Pokemon("Bulbasaur", 1, 1, "Fushigidane"); // Strange Seed
static Pokemon Ivysaur = new Pokemon("Ivysaur", 2, 1, "Fushigisou"); // Strange Grass
static Pokemon Venusaur = new Pokemon("Venusaur", 3, 1, "Fushigibana"); // Strange Flower
static Pokemon MegaVenusaur = new Pokemon("Mega Venusaur", 3, 6, "Fushigibana"); // Same as Venusaur
static Pokemon Charmander = new Pokemon("Charmander", 4, 1, "Hitokage"); // Fire Lizard
static Pokemon Charmeleon = new Pokemon("Charmeleon", 5, 1, "Lizardo"); // Lizard
static Pokemon Charizard = new Pokemon("Charizard", 6, 1, "Lizardon"); // Lizard + Don (suffix)
static Pokemon MegaCharizardXCharizard = new Pokemon("Mega Charizard X Charizard", 6, 6, "Lizardon");
static Pokemon MegaCharizardYCharizard = new Pokemon("Mega Charizard Y Charizard", 6, 6, "Lizardon");
static Pokemon Squirtle = new Pokemon("Squirtle", 7, 1, "Zenigame"); // Pond Turtle
static Pokemon Wartortle = new Pokemon("Wartortle", 8, 1, "Kameil"); // Turtle + Tail pun
static Pokemon Blastoise = new Pokemon("Blastoise", 9, 1, "Kamex"); // Turtle + X (power)
static Pokemon MegaBlastoise = new Pokemon("Mega Blastoise", 9, 6, "Kamex");
static Pokemon Caterpie = new Pokemon("Caterpie", 10, 1, "Caterpie"); // Same name
static Pokemon Metapod = new Pokemon("Metapod", 11, 1, "Trancell"); // Transparent Cell
static Pokemon Butterfree = new Pokemon("Butterfree", 12, 1, "Butterfree"); // Same name
static Pokemon Weedle = new Pokemon("Weedle", 13, 1, "Beedle"); // Bee + Doodlebug
static Pokemon Kakuna = new Pokemon("Kakuna", 14, 1, "Cocoon"); // Cocoon
static Pokemon Beedrill = new Pokemon("Beedrill", 15, 1, "Spear"); // Spear
static Pokemon MegaBeedrill = new Pokemon("Mega Beedrill", 15, 6, "Spear");
static Pokemon Pidgey = new Pokemon("Pidgey", 16, 1, "Poppo"); // Pigeon
static Pokemon Pidgeotto = new Pokemon("Pidgeotto", 17, 1, "Pigeon"); // Pigeon
static Pokemon Pidgeot = new Pokemon("Pidgeot", 18, 1, "Pigeot"); // Pigeon + Jet
static Pokemon MegaPidgeot = new Pokemon("Mega Pidgeot", 18, 6, "Pigeot");
static Pokemon Rattata = new Pokemon("Rattata", 19, 1, "Koratta"); // Small Rat
static Pokemon AlolanRattata = new Pokemon("Alolan Rattata", 19, 7, "Koratta", "019_f2");
static Pokemon Raticate = new Pokemon("Raticate", 20, 1, "Ratta"); // Rat
static Pokemon AlolanRaticate = new Pokemon("Alolan Raticate", 20, 7, "Ratta", "020_f2");
static Pokemon Spearow = new Pokemon("Spearow", 21, 1, "Onisuzume"); // Demon Sparrow
static Pokemon Fearow = new Pokemon("Fearow", 22, 1, "Onidrill"); // Demon Drill
static Pokemon Ekans = new Pokemon("Ekans", 23, 1, "Arbo"); // From "Boa"
static Pokemon Arbok = new Pokemon("Arbok", 24, 1, "Arbok"); // Cobra reversed
static Pokemon Pikachu = new Pokemon("Pikachu", 25, 1, "Pikachu"); // Spark + Mouse
static Pokemon Raichu = new Pokemon("Raichu", 26, 1, "Raichu"); // Thunder + Mouse
static Pokemon AlolanRaichu = new Pokemon("Alolan Raichu", 26, 7, "Raichu", "026_f2");
static Pokemon Sandshrew = new Pokemon("Sandshrew", 27, 1, "Sand"); // Same concept
static Pokemon AlolanSandshrew = new Pokemon("Alolan Sandshrew", 27, 7, "Sand", "027_f2");
static Pokemon Sandslash = new Pokemon("Sandslash", 28, 1, "Sandpan"); // Sand + Pangolin
static Pokemon AlolanSandslash = new Pokemon("Alolan Sandslash", 28, 7, "Sandpan", "028_f2");
static Pokemon Nidoran_f = new Pokemon("Nidoran-f", 29, 1, "Nidoran♀");
static Pokemon Nidorina = new Pokemon("Nidorina", 30, 1, "Nidorina");
static Pokemon Nidoqueen = new Pokemon("Nidoqueen", 31, 1, "Nidoqueen");
static Pokemon Nidoran_m = new Pokemon("Nidoran-m", 32, 1, "Nidoran♂");
static Pokemon Nidorino = new Pokemon("Nidorino", 33, 1, "Nidorino");
static Pokemon Nidoking = new Pokemon("Nidoking", 34, 1, "Nidoking");
static Pokemon Clefairy = new Pokemon("Clefairy", 35, 1, "Pippi"); // Cute/childlike name
static Pokemon Clefable = new Pokemon("Clefable", 36, 1, "Pixy"); // Pixie
static Pokemon Vulpix = new Pokemon("Vulpix", 37, 1, "Rokon"); // Six Tails
static Pokemon AlolanVulpix = new Pokemon("Alolan Vulpix", 37, 7, "Rokon", "037_f2");
static Pokemon Ninetales = new Pokemon("Ninetales", 38, 1, "Kyukon"); // Nine Tails
static Pokemon AlolanNinetales = new Pokemon("Alolan Ninetales", 38, 7, "Kyukon", "038_f2");
static Pokemon Jigglypuff = new Pokemon("Jigglypuff", 39, 1, "Purin"); // Pudding
static Pokemon Wigglytuff = new Pokemon("Wigglytuff", 40, 1, "Pukurin"); // Soft + Pudding
static Pokemon Zubat = new Pokemon("Zubat", 41, 1, "Zubat"); // From "bat"
static Pokemon Golbat = new Pokemon("Golbat", 42, 1, "Golbat");
static Pokemon Oddish = new Pokemon("Oddish", 43, 1, "Nazonokusa"); // Mysterious Grass
static Pokemon Gloom = new Pokemon("Gloom", 44, 1, "Kusaihana"); // Smelly Flower
static Pokemon Vileplume = new Pokemon("Vileplume", 45, 1, "Ruffresia"); // Rafflesia flower
static Pokemon Paras = new Pokemon("Paras", 46, 1, "Paras"); // Same name
static Pokemon Parasect = new Pokemon("Parasect", 47, 1, "Parasect");
static Pokemon Venonat = new Pokemon("Venonat", 48, 1, "Kongpang"); // Gong + Pang (onomatopoeia)
static Pokemon Venomoth = new Pokemon("Venomoth", 49, 1, "Morphon"); // Morph + Moth
static Pokemon Diglett = new Pokemon("Diglett", 50, 1, "Digda"); // Dig + Da (sound)
static Pokemon AlolanDiglett = new Pokemon("Alolan Diglett", 50, 7, "Digda", "050_f2");
static Pokemon Dugtrio = new Pokemon("Dugtrio", 51, 1, "Dugtrio"); // Same name
static Pokemon AlolanDugtrio = new Pokemon("Alolan Dugtrio", 51, 7, "Dugtrio", "051_f2");
static Pokemon Meowth = new Pokemon("Meowth", 52, 1, "Nyarth"); // Nyaa (meow) + Earth
static Pokemon AlolanMeowth = new Pokemon("Alolan Meowth", 52, 7, "Nyarth", "052_f2");
static Pokemon GalarianMeowth = new Pokemon("Galarian Meowth", 52, 8, "Nyarth", "052_f3");
static Pokemon Persian = new Pokemon("Persian", 53, 1, "Persian"); // Same name
static Pokemon AlolanPersian = new Pokemon("Alolan Persian", 53, 7, "Persian", "053_f2");
static Pokemon Psyduck = new Pokemon("Psyduck", 54, 1, "Koduck"); // Child Duck
static Pokemon Golduck = new Pokemon("Golduck", 55, 1, "Golduck"); // Gold Duck
static Pokemon Mankey = new Pokemon("Mankey", 56, 1, "Mankey"); // Same name
static Pokemon Primeape = new Pokemon("Primeape", 57, 1, "Okorizaru"); // Angry Monkey
static Pokemon Growlithe = new Pokemon("Growlithe", 58, 1, "Gardie"); // Guard Dog
static Pokemon HisuianGrowlithe = new Pokemon("Hisuian Growlithe", 58, 8, "Gardie", "058_f2");
static Pokemon Arcanine = new Pokemon("Arcanine", 59, 1, "Windie"); // Windy
static Pokemon HisuianArcanine = new Pokemon("Hisuian Arcanine", 59, 8, "Windie", "059_f2");
static Pokemon Poliwag = new Pokemon("Poliwag", 60, 1, "Nyoromo"); // Wriggler
static Pokemon Poliwhirl = new Pokemon("Poliwhirl", 61, 1, "Nyorozo"); // Wriggler (bigger)
static Pokemon Poliwrath = new Pokemon("Poliwrath", 62, 1, "Nyorobon"); // Wriggler + Bon (big)
static Pokemon Abra = new Pokemon("Abra", 63, 1, "Casey"); // Named after Casey (psychic)
static Pokemon Kadabra = new Pokemon("Kadabra", 64, 1, "Yungerer"); // Uri Geller reference
static Pokemon Alakazam = new Pokemon("Alakazam", 65, 1, "Foodin"); // Houdini reference
static Pokemon MegaAlakazam = new Pokemon("Mega Alakazam", 65, 6, "Foodin");
static Pokemon Machop = new Pokemon("Machop", 66, 1, "Wanriky"); // Power + Strength
static Pokemon Machoke = new Pokemon("Machoke", 67, 1, "Goriky"); // Gorilla Strength
static Pokemon Machamp = new Pokemon("Machamp", 68, 1, "Kairiky"); // Super Strength
static Pokemon Bellsprout = new Pokemon("Bellsprout", 69, 1, "Madatsubomi"); // Bud
static Pokemon Weepinbell = new Pokemon("Weepinbell", 70, 1, "Utsudon"); // Pitcher Plant
static Pokemon Victreebel = new Pokemon("Victreebel", 71, 1, "Utsubot"); // Pitcher Plant (bigger)
static Pokemon Tentacool = new Pokemon("Tentacool", 72, 1, "Menokurage"); // Jellyfish
static Pokemon Tentacruel = new Pokemon("Tentacruel", 73, 1, "Dokukurage"); // Poison Jellyfish
static Pokemon Geodude = new Pokemon("Geodude", 74, 1, "Isitsubute"); // Rock Thrower
static Pokemon AlolanGeodude = new Pokemon("Alolan Geodude", 74, 7, "Isitsubute", "074_f2");
static Pokemon Graveler = new Pokemon("Graveler", 75, 1, "Golone"); // Rolling Stone
static Pokemon AlolanGraveler = new Pokemon("Alolan Graveler", 75, 7, "Golone", "075_f2");
static Pokemon Golem = new Pokemon("Golem", 76, 1, "Golonya"); // Golem
static Pokemon AlolanGolem = new Pokemon("Alolan Golem", 76, 7, "Golonya", "076_f2");
static Pokemon Ponyta = new Pokemon("Ponyta", 77, 1, "Ponyta"); // Same name
static Pokemon GalarianPonyta = new Pokemon("Galarian Ponyta", 77, 8, "Ponyta", "077_f2");
static Pokemon Rapidash = new Pokemon("Rapidash", 78, 1, "Gallop"); // Gallop
static Pokemon GalarianRapidash = new Pokemon("Galarian Rapidash", 78, 8, "Gallop", "078_f2");
static Pokemon Slowpoke = new Pokemon("Slowpoke", 79, 1, "Yadon"); // Dopey
static Pokemon GalarianSlowpoke = new Pokemon("Galarian Slowpoke", 79, 8, "Yadon", "079_f2");
static Pokemon Slowbro = new Pokemon("Slowbro", 80, 1, "Yadoran"); // Dopey + Shelled
static Pokemon MegaSlowbro = new Pokemon("Mega Slowbro", 80, 6, "Yadoran");
static Pokemon GalarianSlowbro = new Pokemon("Galarian Slowbro", 80, 8, "Yadoran", "080_f3");
static Pokemon Magnemite = new Pokemon("Magnemite", 81, 1, "Coil"); // Coil
static Pokemon Magneton = new Pokemon("Magneton", 82, 1, "Rarecoil"); // Rare Coil
static Pokemon Farfetchd = new Pokemon("Farfetchd", 83, 1, "Kamonegi"); // Duck + Leek
static Pokemon GalarianFarfetchd = new Pokemon("Galarian Farfetch'd", 83, 8, "Kamonegi", "083_f2");
static Pokemon Doduo = new Pokemon("Doduo", 84, 1, "Dodo"); // Dodo bird
static Pokemon Dodrio = new Pokemon("Dodrio", 85, 1, "Dodorio"); // Dodo + Trio
static Pokemon Seel = new Pokemon("Seel", 86, 1, "Pawou"); // Sound of blowing water
static Pokemon Dewgong = new Pokemon("Dewgong", 87, 1, "Jugon"); // Dugong
static Pokemon Grimer = new Pokemon("Grimer", 88, 1, "Betbeter"); // Sticky Sludge
static Pokemon AlolanGrimer = new Pokemon("Alolan Grimer", 88, 7, "Betbeter", "088_f2");
static Pokemon Muk = new Pokemon("Muk", 89, 1, "Betbeton"); // Bigger Sludge
static Pokemon AlolanMuk = new Pokemon("Alolan Muk", 89, 7, "Betbeton", "089_f2");
static Pokemon Shellder = new Pokemon("Shellder", 90, 1, "Shellder"); // Same name
static Pokemon Cloyster = new Pokemon("Cloyster", 91, 1, "Parshen"); // Pearl + Shell
static Pokemon Gastly = new Pokemon("Gastly", 92, 1, "Ghos"); // Ghost
static Pokemon Haunter = new Pokemon("Haunter", 93, 1, "Ghost"); // Ghost
static Pokemon Gengar = new Pokemon("Gengar", 94, 1, "Gengar"); // Doppelgänger pun
static Pokemon MegaGengar = new Pokemon("Mega Gengar", 94, 6, "Gengar");
static Pokemon Onix = new Pokemon("Onix", 95, 1, "Iwark"); // Rock Snake
static Pokemon Drowzee = new Pokemon("Drowzee", 96, 1, "Sleep"); // Sleep
static Pokemon Hypno = new Pokemon("Hypno", 97, 1, "Sleeper"); // Sleeper
static Pokemon Krabby = new Pokemon("Krabby", 98, 1, "Crab"); // Crab
static Pokemon Kingler = new Pokemon("Kingler", 99, 1, "Kingler"); // Same name
static Pokemon Voltorb = new Pokemon("Voltorb", 100, 1, "Biriridama"); // Electric Ball
static Pokemon HisuianVoltorb = new Pokemon("Hisuian Voltorb", 100, 8, "Biriridama", "100_f2");
static Pokemon Electrode = new Pokemon("Electrode", 101, 1, "Marumain"); // Round Mine
static Pokemon HisuianElectrode = new Pokemon("Hisuian Electrode", 101, 8, "Marumain", "101_f2");
static Pokemon Exeggcute = new Pokemon("Exeggcute", 102, 1, "Tamatama"); // Eggs
static Pokemon Exeggutor = new Pokemon("Exeggutor", 103, 1, "Nassy"); // Coconut Tree
static Pokemon AlolanExeggutor = new Pokemon("Alolan Exeggutor", 103, 7, "Nassy", "103_f2");
static Pokemon Cubone = new Pokemon("Cubone", 104, 1, "Karakara"); // Clattering Bones
static Pokemon Marowak = new Pokemon("Marowak", 105, 1, "Garagara"); // Rattling Bones
static Pokemon AlolanMarowak = new Pokemon("Alolan Marowak", 105, 7, "Garagara", "105_f2");
static Pokemon Hitmonlee = new Pokemon("Hitmonlee", 106, 1, "Sawamular"); // Kickboxer Sawamura
static Pokemon Hitmonchan = new Pokemon("Hitmonchan", 107, 1, "Ebiwalar"); // Boxer Ebihara
static Pokemon Lickitung = new Pokemon("Lickitung", 108, 1, "Beroringa"); // Long Tongue
static Pokemon Koffing = new Pokemon("Koffing", 109, 1, "Dogars"); // Gas
static Pokemon Weezing = new Pokemon("Weezing", 110, 1, "Matadogas"); // More Gas
static Pokemon GalarianWeezing = new Pokemon("Galarian Weezing", 110, 8, "Matadogas", "110_f2");
static Pokemon Rhyhorn = new Pokemon("Rhyhorn", 111, 1, "Sihorn"); // Spike Horn
static Pokemon Rhydon = new Pokemon("Rhydon", 112, 1, "Sidon"); // Spike Don
static Pokemon Chansey = new Pokemon("Chansey", 113, 1, "Lucky"); // Lucky
static Pokemon Tangela = new Pokemon("Tangela", 114, 1, "Monjara"); // Tangled Vine
static Pokemon Kangaskhan = new Pokemon("Kangaskhan", 115, 1, "Garura"); // Kangaroo
static Pokemon MegaKangaskhan = new Pokemon("Mega Kangaskhan", 115, 6, "Garura");
static Pokemon Horsea = new Pokemon("Horsea", 116, 1, "Tattu"); // Seahorse
static Pokemon Seadra = new Pokemon("Seadra", 117, 1, "Seadra"); // Same name
static Pokemon Goldeen = new Pokemon("Goldeen", 118, 1, "Tosakinto"); // Goldfish
static Pokemon Seaking = new Pokemon("Seaking", 119, 1, "Azumao"); // Goldfish (big)
static Pokemon Staryu = new Pokemon("Staryu", 120, 1, "Hitodeman"); // Starfish
static Pokemon Starmie = new Pokemon("Starmie", 121, 1, "Starmie"); // Same name
static Pokemon Mr_mime = new Pokemon("Mr-mime", 122, 1, "Barrierd"); // Barrier
static Pokemon GalarianMrMime = new Pokemon("Galarian Mr. Mime", 122, 8, "Barrierd", "122_f2");
static Pokemon Scyther = new Pokemon("Scyther", 123, 1, "Strike"); // Strike
static Pokemon Jynx = new Pokemon("Jynx", 124, 1, "Rougela"); // Rouge (makeup)
static Pokemon Electabuzz = new Pokemon("Electabuzz", 125, 1, "Eleboo"); // Electric + Boo (sound)
static Pokemon Magmar = new Pokemon("Magmar", 126, 1, "Boober"); // Boiling + Bird
static Pokemon Pinsir = new Pokemon("Pinsir", 127, 1, "Kailios"); // Stag beetle
static Pokemon MegaPinsir = new Pokemon("Mega Pinsir", 127, 6, "Kailios");
static Pokemon Tauros = new Pokemon("Tauros", 128, 1, "Kentauros"); // Centaur + Taurus
static Pokemon CombatBreedTauros = new Pokemon("Combat Breed Tauros", 128, 9, "Kentauros", "128_f2");
static Pokemon BlazeBreedTauros = new Pokemon("Blaze Breed Tauros", 128, 9, "Kentauros", "128_f3");
static Pokemon AquaBreedTauros = new Pokemon("Aqua Breed Tauros", 128, 9, "Kentauros", "128_f4");
static Pokemon Magikarp = new Pokemon("Magikarp", 129, 1, "Koiking"); // Carp King
static Pokemon Gyarados = new Pokemon("Gyarados", 130, 1, "Gyarados"); // Derived from "wrath"
static Pokemon MegaGyarados = new Pokemon("Mega Gyarados", 130, 6, "Gyarados");
static Pokemon Lapras = new Pokemon("Lapras", 131, 1, "Laplace"); // Named after mathematician Laplace
static Pokemon Ditto = new Pokemon("Ditto", 132, 1, "Metamon"); // Metamorphosis Monster
static Pokemon Eevee = new Pokemon("Eevee", 133, 1, "Eievui"); // Evolution pun
static Pokemon Vaporeon = new Pokemon("Vaporeon", 134, 1, "Showers"); // Water shower
static Pokemon Jolteon = new Pokemon("Jolteon", 135, 1, "Thunders"); // Thunder
static Pokemon Flareon = new Pokemon("Flareon", 136, 1, "Booster"); // Boost (fire)
static Pokemon Porygon = new Pokemon("Porygon", 137, 1, "Porygon"); // Polygon
static Pokemon Omanyte = new Pokemon("Omanyte", 138, 1, "Omnite"); // Ammonite
static Pokemon Omastar = new Pokemon("Omastar", 139, 1, "Omstar"); // Ammonite + Star
static Pokemon Kabuto = new Pokemon("Kabuto", 140, 1, "Kabuto"); // Helmet
static Pokemon Kabutops = new Pokemon("Kabutops", 141, 1, "Kabutops"); // Helmet + Tops (cut)
static Pokemon Aerodactyl = new Pokemon("Aerodactyl", 142, 1, "Ptera"); // Pterodactyl
static Pokemon MegaAerodactyl = new Pokemon("Mega Aerodactyl", 142, 6, "Ptera");
static Pokemon Snorlax = new Pokemon("Snorlax", 143, 1, "Kabigon"); // Named after a staff member
static Pokemon Articuno = new Pokemon("Articuno", 144, 1, "Freezer"); // Freezer
static Pokemon GalarianArticuno = new Pokemon("Galarian Articuno", 144, 8, "Freezer", "144_f2");
static Pokemon Zapdos = new Pokemon("Zapdos", 145, 1, "Thunder"); // Thunder
static Pokemon GalarianZapdos = new Pokemon("Galarian Zapdos", 145, 8, "Thunder", "145_f2");
static Pokemon Moltres = new Pokemon("Moltres", 146, 1, "Fire"); // Fire
static Pokemon GalarianMoltres = new Pokemon("Galarian Moltres", 146, 8, "Fire", "146_f2");
static Pokemon Dratini = new Pokemon("Dratini", 147, 1, "Miniryu"); // Mini Dragon
static Pokemon Dragonair = new Pokemon("Dragonair", 148, 1, "Hakuryu"); // White Dragon
static Pokemon Dragonite = new Pokemon("Dragonite", 149, 1, "Kairyu"); // Sea Dragon
static Pokemon Mewtwo = new Pokemon("Mewtwo", 150, 1, "Mewtwo"); // Clone of Mew
static Pokemon MegaMewtwoXMewtwo = new Pokemon("Mega Mewtwo X Mewtwo", 150, 6, "Mewtwo");
static Pokemon MegaMewtwoYMewtwo = new Pokemon("Mega Mewtwo Y Mewtwo", 150, 6, "Mewtwo");
static Pokemon Mew = new Pokemon("Mew", 151, 1, "Mew"); // Same name
static Pokemon Chikorita = new Pokemon("Chikorita", 152, 2, "Chicorita"); // Chicory plant
static Pokemon Bayleef = new Pokemon("Bayleef", 153, 2, "Bayleaf"); // Bay leaf
static Pokemon Meganium = new Pokemon("Meganium", 154, 2, "Meganium"); // Mega + Geranium
static Pokemon Cyndaquil = new Pokemon("Cyndaquil", 155, 2, "Hinoarashi"); // Fire Porcupine
static Pokemon Quilava = new Pokemon("Quilava", 156, 2, "Magmarashi"); // Fire + Storm
static Pokemon Typhlosion = new Pokemon("Typhlosion", 157, 2, "Bakphoon"); // Explosion
static Pokemon HisuianTyphlosion = new Pokemon("Hisuian Typhlosion", 157, 8, "Bakphoon", "157_f2");
static Pokemon Totodile = new Pokemon("Totodile", 158, 2, "Waninoko"); // Crocodile child
static Pokemon Croconaw = new Pokemon("Croconaw", 159, 2, "Alligates"); // Alligator
static Pokemon Feraligatr = new Pokemon("Feraligatr", 160, 2, "Ordile"); // Big crocodile
static Pokemon Sentret = new Pokemon("Sentret", 161, 2, "Otachi"); // Scout
static Pokemon Furret = new Pokemon("Furret", 162, 2, "Ootachi"); // Large scout
static Pokemon Hoothoot = new Pokemon("Hoothoot", 163, 2, "Hoho"); // Owl sound
static Pokemon Noctowl = new Pokemon("Noctowl", 164, 2, "Yorunozuku"); // Night Owl
static Pokemon Ledyba = new Pokemon("Ledyba", 165, 2, "Rediba"); // Ladybug
static Pokemon Ledian = new Pokemon("Ledian", 166, 2, "Redian"); // Ladybug + Guardian
static Pokemon Spinarak = new Pokemon("Spinarak", 167, 2, "Itomaru"); // Thread Ball
static Pokemon Ariados = new Pokemon("Ariados", 168, 2, "Ariados"); // Ariadne (myth)
static Pokemon Crobat = new Pokemon("Crobat", 169, 2, "Kurobat"); // Black Bat
static Pokemon Chinchou = new Pokemon("Chinchou", 170, 2, "Chonchie"); // Lantern fish
static Pokemon Lanturn = new Pokemon("Lanturn", 171, 2, "Lantern"); // Lantern
static Pokemon Pichu = new Pokemon("Pichu", 172, 2, "Pichu"); // Small Pikachu
static Pokemon Cleffa = new Pokemon("Cleffa", 173, 2, "Py"); // Cute sound
static Pokemon Igglybuff = new Pokemon("Igglybuff", 174, 2, "Pupurin"); // Soft pudding
static Pokemon Togepi = new Pokemon("Togepi", 175, 2, "Togepy"); // Spike Egg
static Pokemon Togetic = new Pokemon("Togetic", 176, 2, "Togechick"); // Spike Chick
static Pokemon Natu = new Pokemon("Natu", 177, 2, "Natyu"); // Native bird
static Pokemon Xatu = new Pokemon("Xatu", 178, 2, "Natyu"); // Same root
static Pokemon Mareep = new Pokemon("Mareep", 179, 2, "Merriep"); // Sheep
static Pokemon Flaaffy = new Pokemon("Flaaffy", 180, 2, "Mokoko"); // Fluffy
static Pokemon Ampharos = new Pokemon("Ampharos", 181, 2, "Denryu"); // Electric Dragon
static Pokemon MegaAmpharos = new Pokemon("Mega Ampharos", 181, 6, "Denryu");
static Pokemon Bellossom = new Pokemon("Bellossom", 182, 2, "Kireihana"); // Pretty Flower
static Pokemon Marill = new Pokemon("Marill", 183, 2, "Maril"); // Marine + Lil
static Pokemon Azumarill = new Pokemon("Azumarill", 184, 2, "Marilli"); // Marine + Lily
static Pokemon Sudowoodo = new Pokemon("Sudowoodo", 185, 2, "Usokkie"); // Liar Tree
static Pokemon Politoed = new Pokemon("Politoed", 186, 2, "Nyorotono"); // Big Wriggler
static Pokemon Hoppip = new Pokemon("Hoppip", 187, 2, "Hanecco"); // Feather Child
static Pokemon Skiploom = new Pokemon("Skiploom", 188, 2, "Popocco"); // Pop + Plant
static Pokemon Jumpluff = new Pokemon("Jumpluff", 189, 2, "Watacco"); // Cotton Plant
static Pokemon Aipom = new Pokemon("Aipom", 190, 2, "Eipam"); // Ape + Palm
static Pokemon Sunkern = new Pokemon("Sunkern", 191, 2, "Himanuts"); // Sunflower seed
static Pokemon Sunflora = new Pokemon("Sunflora", 192, 2, "Kimawari"); // Sunflower
static Pokemon Yanma = new Pokemon("Yanma", 193, 2, "Yanyanma"); // Dragonfly
static Pokemon Wooper = new Pokemon("Wooper", 194, 2, "Upah"); // Axolotl
static Pokemon PaldeanWooper = new Pokemon("Paldean Wooper", 194, 9, "Upah", "194_f2");
static Pokemon Quagsire = new Pokemon("Quagsire", 195, 2, "Nuoh"); // Slow + Big
static Pokemon Espeon = new Pokemon("Espeon", 196, 2, "Eifie"); // ESP + Fairy
static Pokemon Umbreon = new Pokemon("Umbreon", 197, 2, "Blacky"); // Black
static Pokemon Murkrow = new Pokemon("Murkrow", 198, 2, "Yamikarasu"); // Darkness Crow
static Pokemon Slowking = new Pokemon("Slowking", 199, 2, "Yadoking"); // Dopey King
static Pokemon GalarianSlowking = new Pokemon("Galarian Slowking", 199, 8, "Yadoking", "199_f2");
static Pokemon Misdreavus = new Pokemon("Misdreavus", 200, 2, "Muma"); // Wailing spirit
static Pokemon Unown = new Pokemon("Unown", 201, 2, "Unknown"); // Same concept
static Pokemon Wobbuffet = new Pokemon("Wobbuffet", 202, 2, "Sonans"); // "That's right!"
static Pokemon Girafarig = new Pokemon("Girafarig", 203, 2, "Kirinriki"); // Giraffe + Psychic
static Pokemon Pineco = new Pokemon("Pineco", 204, 2, "Kunugidama"); // Acorn Ball
static Pokemon Forretress = new Pokemon("Forretress", 205, 2, "Foretos"); // Fortress
static Pokemon Dunsparce = new Pokemon("Dunsparce", 206, 2, "Nokocchi"); // Tsuchinoko (cryptid)
static Pokemon Gligar = new Pokemon("Gligar", 207, 2, "Gliger"); // Glide + Tiger
static Pokemon Steelix = new Pokemon("Steelix", 208, 2, "Haganeil"); // Steel + Nail
static Pokemon MegaSteelix = new Pokemon("Mega Steelix", 208, 6, "Haganeil");
static Pokemon Snubbull = new Pokemon("Snubbull", 209, 2, "Buru"); // Bull (dog)
static Pokemon Granbull = new Pokemon("Granbull", 210, 2, "Granburu"); // Grand Bull
static Pokemon Qwilfish = new Pokemon("Qwilfish", 211, 2, "Harysen"); // Spiky Needlefish
static Pokemon HisuianQwilfish = new Pokemon("Hisuian Qwilfish", 211, 8, "Harysen", "211_f2");
static Pokemon Scizor = new Pokemon("Scizor", 212, 2, "Hassam"); // Scissors
static Pokemon MegaScizor = new Pokemon("Mega Scizor", 212, 6, "Hassam");
static Pokemon Shuckle = new Pokemon("Shuckle", 213, 2, "Tsubotsubo"); // Pot Jar
static Pokemon Heracross = new Pokemon("Heracross", 214, 2, "Heracros"); // Hercules beetle
static Pokemon MegaHeracross = new Pokemon("Mega Heracross", 214, 6);
static Pokemon Sneasel = new Pokemon("Sneasel", 215, 2, "Nyula"); // Sneak + Claw
static Pokemon HisuianSneasel = new Pokemon("Hisuian Sneasel", 215, 8, "Nyula", "215_f2");
static Pokemon Teddiursa = new Pokemon("Teddiursa", 216, 2, "Himeguma"); // Princess Bear
static Pokemon Ursaring = new Pokemon("Ursaring", 217, 2, "Ringuma"); // Ring Bear
static Pokemon Slugma = new Pokemon("Slugma", 218, 2, "Magmag"); // Magma
static Pokemon Magcargo = new Pokemon("Magcargo", 219, 2, "Magcargot"); // Magma + Escargot
static Pokemon Swinub = new Pokemon("Swinub", 220, 2, "Urimoo"); // Ice Pig
static Pokemon Piloswine = new Pokemon("Piloswine", 221, 2, "Inomoo"); // Boar Pig
static Pokemon Corsola = new Pokemon("Corsola", 222, 2, "Saniigo"); // Coral
static Pokemon GalarianCorsola = new Pokemon("Galarian Corsola", 222, 8, "Saniigo", "222_f2");
static Pokemon Remoraid = new Pokemon("Remoraid", 223, 2, "Teppouo"); // Gun Fish
static Pokemon Octillery = new Pokemon("Octillery", 224, 2, "Okutank"); // Octopus Tank
static Pokemon Delibird = new Pokemon("Delibird", 225, 2, "Delibird"); // Delivery Bird
static Pokemon Mantine = new Pokemon("Mantine", 226, 2, "Mantain"); // Manta Ray
static Pokemon Skarmory = new Pokemon("Skarmory", 227, 2, "Airmd"); // Air + Armed
static Pokemon Houndour = new Pokemon("Houndour", 228, 2, "Delvil"); // Devil
static Pokemon Houndoom = new Pokemon("Houndoom", 229, 2, "Hellgar"); // Hell + Guard
static Pokemon MegaHoundoom = new Pokemon("Mega Houndoom", 229, 6, "Hellgar");
static Pokemon Kingdra = new Pokemon("Kingdra", 230, 2, "Kingdra"); // Same name
static Pokemon Phanpy = new Pokemon("Phanpy", 231, 2, "Gomazou"); // Little Elephant
static Pokemon Donphan = new Pokemon("Donphan", 232, 2, "Donfan"); // Don (big) + Elephant
static Pokemon Porygon2 = new Pokemon("Porygon2", 233, 2, "Porygon2"); // Same name
static Pokemon Stantler = new Pokemon("Stantler", 234, 2, "Odoshishi"); // Fright Deer
static Pokemon Smeargle = new Pokemon("Smeargle", 235, 2, "Doble"); // Doodle
static Pokemon Tyrogue = new Pokemon("Tyrogue", 236, 2, "Balkie"); // Bulky
static Pokemon Hitmontop = new Pokemon("Hitmontop", 237, 2, "Kapoerer"); // Capoeira
static Pokemon Smoochum = new Pokemon("Smoochum", 238, 2, "Muchul"); // Kiss Child
static Pokemon Elekid = new Pokemon("Elekid", 239, 2, "Elekid"); // Same name
static Pokemon Magby = new Pokemon("Magby", 240, 2, "Buby"); // Baby + Boil
static Pokemon Miltank = new Pokemon("Miltank", 241, 2, "Miltank"); // Same name
static Pokemon Blissey = new Pokemon("Blissey", 242, 2, "Happinas"); // Happiness
static Pokemon Raikou = new Pokemon("Raikou", 243, 2, "Raikou"); // Thunder Emperor
static Pokemon Entei = new Pokemon("Entei", 244, 2, "Entei"); // Flame Emperor
static Pokemon Suicune = new Pokemon("Suicune", 245, 2, "Suicune"); // Water Monarch
static Pokemon Larvitar = new Pokemon("Larvitar", 246, 2, "Yogiras"); // Yogurt + Giras (lizard)
static Pokemon Pupitar = new Pokemon("Pupitar", 247, 2, "Sanagiras"); // Pupa + Giras
static Pokemon Tyranitar = new Pokemon("Tyranitar", 248, 2, "Bangiras"); // Violent Lizard
static Pokemon MegaTyranitar = new Pokemon("Mega Tyranitar", 248, 6, "Bangiras");
static Pokemon Lugia = new Pokemon("Lugia", 249, 2, "Lugia"); // Same name
static Pokemon Ho_oh = new Pokemon("Ho-Oh", 250, 2, "Houou"); // Phoenix
static Pokemon Celebi = new Pokemon("Celebi", 251, 2, "Celebi"); // Same name
static Pokemon Treecko = new Pokemon("Treecko", 252, 3, "Kimori"); // Wood Gecko
static Pokemon Grovyle = new Pokemon("Grovyle", 253, 3, "Juptile"); // Jungle Reptile
static Pokemon Sceptile = new Pokemon("Sceptile", 254, 3, "Jukain"); // Jungle + Giant
static Pokemon MegaSceptile = new Pokemon("Mega Sceptile", 254, 6, "Jukain");
static Pokemon Torchic = new Pokemon("Torchic", 255, 3, "Achamo"); // Sparkling Chick
static Pokemon Combusken = new Pokemon("Combusken", 256, 3, "Wakasyamo"); // Young Warrior
static Pokemon Blaziken = new Pokemon("Blaziken", 257, 3, "Bursyamo"); // Burning Warrior
static Pokemon MegaBlaziken = new Pokemon("Mega Blaziken", 257, 6, "Bursyamo");
static Pokemon Mudkip = new Pokemon("Mudkip", 258, 3, "Mizugorou"); // Water Mud Puppy
static Pokemon Marshtomp = new Pokemon("Marshtomp", 259, 3, "Numacraw"); // Swamp Claw
static Pokemon Swampert = new Pokemon("Swampert", 260, 3, "Laglarge"); // Large Lagoon
static Pokemon MegaSwampert = new Pokemon("Mega Swampert", 260, 6, "Laglarge");
static Pokemon Poochyena = new Pokemon("Poochyena", 261, 3, "Pochiena"); // Pochi (dog name) + Hyena
static Pokemon Mightyena = new Pokemon("Mightyena", 262, 3, "Graena"); // Gray Hyena
static Pokemon Zigzagoon = new Pokemon("Zigzagoon", 263, 3, "Jiguzaguma"); // Zigzag Bear
static Pokemon GalarianZigzagoon = new Pokemon("Galarian Zigzagoon", 263, 8, "Jiguzaguma", "263_f2");
static Pokemon Linoone = new Pokemon("Linoone", 264, 3, "Massuguma"); // Straight Bear
static Pokemon GalarianLinoone = new Pokemon("Galarian Linoone", 264, 8, "Massuguma", "264_f2");
static Pokemon Wurmple = new Pokemon("Wurmple", 265, 3, "Kemusso"); // Caterpillar
static Pokemon Silcoon = new Pokemon("Silcoon", 266, 3, "Karasalis"); // Cocoon
static Pokemon Beautifly = new Pokemon("Beautifly", 267, 3, "Agehunt"); // Elegant Butterfly
static Pokemon Cascoon = new Pokemon("Cascoon", 268, 3, "Mayuld"); // Cocoon
static Pokemon Dustox = new Pokemon("Dustox", 269, 3, "Dokucale"); // Poison Scale
static Pokemon Lotad = new Pokemon("Lotad", 270, 3, "Hassboh"); // Lotus Hat
static Pokemon Lombre = new Pokemon("Lombre", 271, 3, "Hasubrero"); // Lotus + Sombrero
static Pokemon Ludicolo = new Pokemon("Ludicolo", 272, 3, "Runpappa"); // Rumba + Kappa
static Pokemon Seedot = new Pokemon("Seedot", 273, 3, "Taneboh"); // Seed Boy
static Pokemon Nuzleaf = new Pokemon("Nuzleaf", 274, 3, "Konohana"); // Tree Spirit
static Pokemon Shiftry = new Pokemon("Shiftry", 275, 3, "Dirteng"); // Dirt + Tengu
static Pokemon Taillow = new Pokemon("Taillow", 276, 3, "Subame"); // Swallow
static Pokemon Swellow = new Pokemon("Swellow", 277, 3, "Oosubame"); // Big Swallow
static Pokemon Wingull = new Pokemon("Wingull", 278, 3, "Camome"); // Seagull
static Pokemon Pelipper = new Pokemon("Pelipper", 279, 3, "Pelipper"); // Pelican
static Pokemon Ralts = new Pokemon("Ralts", 280, 3, "Ralts"); // Same name
static Pokemon Kirlia = new Pokemon("Kirlia", 281, 3, "Kirlia"); // Same name
static Pokemon Gardevoir = new Pokemon("Gardevoir", 282, 3, "Sirnight"); // Knightly Lady
static Pokemon MegaGardevoir = new Pokemon("Mega Gardevoir", 282, 6, "Sirnight");
static Pokemon Surskit = new Pokemon("Surskit", 283, 3, "Ametama"); // Candy Drop
static Pokemon Masquerain = new Pokemon("Masquerain", 284, 3, "Amemoth"); // Rain Moth
static Pokemon Shroomish = new Pokemon("Shroomish", 285, 3, "Kinococo"); // Mushroom Child
static Pokemon Breloom = new Pokemon("Breloom", 286, 3, "Kinogassa"); // Mushroom Umbrella
static Pokemon Slakoth = new Pokemon("Slakoth", 287, 3, "Namakero"); // Lazy
static Pokemon Vigoroth = new Pokemon("Vigoroth", 288, 3, "Yarukimono"); // Motivated One
static Pokemon Slaking = new Pokemon("Slaking", 289, 3, "Kekking"); // King of Laziness
static Pokemon Nincada = new Pokemon("Nincada", 290, 3, "Tutinin"); // Dirt Ninja
static Pokemon Ninjask = new Pokemon("Ninjask", 291, 3, "Tekkanin"); // Iron Ninja
static Pokemon Shedinja = new Pokemon("Shedinja", 292, 3, "Nukenin"); // Empty Ninja
static Pokemon Whismur = new Pokemon("Whismur", 293, 3, "Gonyonyo"); // Whispering
static Pokemon Loudred = new Pokemon("Loudred", 294, 3, "Dogohmb"); // Loud Boom
static Pokemon Exploud = new Pokemon("Exploud", 295, 3, "Bakuong"); // Explosion Sound
static Pokemon Makuhita = new Pokemon("Makuhita", 296, 3, "Makunoshita"); // Under the Curtain
static Pokemon Hariyama = new Pokemon("Hariyama", 297, 3, "Hariteyama"); // Slapping Mountain
static Pokemon Azurill = new Pokemon("Azurill", 298, 3, "Ruriri"); // Blue Lily
static Pokemon Nosepass = new Pokemon("Nosepass", 299, 3, "Nosepass"); // Same name
static Pokemon Skitty = new Pokemon("Skitty", 300, 3, "Eneco"); // Energetic Cat
static Pokemon Delcatty = new Pokemon("Delcatty", 301, 3, "Enekororo"); // Elegant Cat
static Pokemon Sableye = new Pokemon("Sableye", 302, 3, "Yamirami"); // Darkness Jewel
static Pokemon MegaSableye = new Pokemon("Mega Sableye", 302, 6, "Yamirami");
static Pokemon Mawile = new Pokemon("Mawile", 303, 3, "Kucheat"); // Cheater (trickster)
static Pokemon MegaMawile = new Pokemon("Mega Mawile", 303, 6, "Kucheat");
static Pokemon Aron = new Pokemon("Aron", 304, 3, "Cokodora"); // Little Steel
static Pokemon Lairon = new Pokemon("Lairon", 305, 3, "Kodora"); // Middle Steel
static Pokemon Aggron = new Pokemon("Aggron", 306, 3, "Bossgodora"); // Boss Steel
static Pokemon MegaAggron = new Pokemon("Mega Aggron", 306, 6, "Bossgodora");
static Pokemon Meditite = new Pokemon("Meditite", 307, 3, "Asanan"); // Ascetic
static Pokemon Medicham = new Pokemon("Medicham", 308, 3, "Charem"); // Charm + Zen
static Pokemon MegaMedicham = new Pokemon("Mega Medicham", 308, 6, "Charem");
static Pokemon Electrike = new Pokemon("Electrike", 309, 3, "Rakurai"); // Lightning
static Pokemon Manectric = new Pokemon("Manectric", 310, 3, "Livolt"); // Live Voltage
static Pokemon MegaManectric = new Pokemon("Mega Manectric", 310, 6, "Livolt");
static Pokemon Plusle = new Pokemon("Plusle", 311, 3, "Prasle"); // Plus
static Pokemon Minun = new Pokemon("Minun", 312, 3, "Mainun"); // Minus
static Pokemon Volbeat = new Pokemon("Volbeat", 313, 3, "Barubeat"); // Firefly Beat
static Pokemon Illumise = new Pokemon("Illumise", 314, 3, "Illumise"); // Illuminate
static Pokemon Roselia = new Pokemon("Roselia", 315, 3, "Roselia"); // Rose
static Pokemon Gulpin = new Pokemon("Gulpin", 316, 3, "Gokulin"); // Gulp
static Pokemon Swalot = new Pokemon("Swalot", 317, 3, "Marunoom"); // Swallow + Balloon
static Pokemon Carvanha = new Pokemon("Carvanha", 318, 3, "Kibanha"); // Fang Piranha
static Pokemon Sharpedo = new Pokemon("Sharpedo", 319, 3, "Samehader"); // Shark + Hader (bite)
static Pokemon MegaSharpedo = new Pokemon("Mega Sharpedo", 319, 6, "Samehader");
static Pokemon Wailmer = new Pokemon("Wailmer", 320, 3, "Hoeruko"); // Blowhole Whale
static Pokemon Wailord = new Pokemon("Wailord", 321, 3, "Whaloh"); // Whale Lord
static Pokemon Numel = new Pokemon("Numel", 322, 3, "Donmel"); // Dull Camel
static Pokemon Camerupt = new Pokemon("Camerupt", 323, 3, "Bakuuda"); // Volcano Camel
static Pokemon MegaCamerupt = new Pokemon("Mega Camerupt", 323, 6, "Bakuuda");
static Pokemon Torkoal = new Pokemon("Torkoal", 324, 3, "Cotoise"); // Coal Tortoise
static Pokemon Spoink = new Pokemon("Spoink", 325, 3, "Baneboo"); // Spring Pig
static Pokemon Grumpig = new Pokemon("Grumpig", 326, 3, "Boopig"); // Boar Pig
static Pokemon Spinda = new Pokemon("Spinda", 327, 3, "Patcheel"); // Patchy
static Pokemon Trapinch = new Pokemon("Trapinch", 328, 3, "Nuckrar"); // Knuckle + Larva
static Pokemon Vibrava = new Pokemon("Vibrava", 329, 3, "Vibrava"); // Vibrate
static Pokemon Flygon = new Pokemon("Flygon", 330, 3, "Flygon"); // Same name
static Pokemon Cacnea = new Pokemon("Cacnea", 331, 3, "Sabonea"); // Saboten (cactus)
static Pokemon Cacturne = new Pokemon("Cacturne", 332, 3, "Noctus"); // Nocturnal Cactus
static Pokemon Swablu = new Pokemon("Swablu", 333, 3, "Tyltto"); // Tilty (bird)
static Pokemon Altaria = new Pokemon("Altaria", 334, 3, "Tyltalis"); // Tilty + Tallis
static Pokemon MegaAltaria = new Pokemon("Mega Altaria", 334, 6, "Tyltalis");
static Pokemon Zangoose = new Pokemon("Zangoose", 335, 3, "Zangoose"); // Same name
static Pokemon Seviper = new Pokemon("Seviper", 336, 3, "Habunake"); // Habu Snake
static Pokemon Lunatone = new Pokemon("Lunatone", 337, 3, "Lunatone"); // Moon Stone
static Pokemon Solrock = new Pokemon("Solrock", 338, 3, "Solrock"); // Sun Rock
static Pokemon Barboach = new Pokemon("Barboach", 339, 3, "Dojoach"); // Loach
static Pokemon Whiscash = new Pokemon("Whiscash", 340, 3, "Namazun"); // Catfish
static Pokemon Corphish = new Pokemon("Corphish", 341, 3, "Heigani"); // Soldier Crab
static Pokemon Crawdaunt = new Pokemon("Crawdaunt", 342, 3, "Shizariger"); // Scissor + Alligator
static Pokemon Baltoy = new Pokemon("Baltoy", 343, 3, "Yajilon"); // Clay Doll
static Pokemon Claydol = new Pokemon("Claydol", 344, 3, "Nendoll"); // Clay Doll
static Pokemon Lileep = new Pokemon("Lileep", 345, 3, "Lilyla"); // Lily
static Pokemon Cradily = new Pokemon("Cradily", 346, 3, "Yuradle"); // Sea Lily
static Pokemon Anorith = new Pokemon("Anorith", 347, 3, "Anopth"); // Anomalocaris
static Pokemon Armaldo = new Pokemon("Armaldo", 348, 3, "Armaldo"); // Same name
static Pokemon Feebas = new Pokemon("Feebas", 349, 3, "Hinbass"); // Poor Bass
static Pokemon Milotic = new Pokemon("Milotic", 350, 3, "Milokaross"); // Melodic + Karos
static Pokemon Castform = new Pokemon("Castform", 351, 3, "Powalen"); // Weather Ball
static Pokemon Kecleon = new Pokemon("Kecleon", 352, 3, "Kakureon"); // Hidden Chameleon
static Pokemon Shuppet = new Pokemon("Shuppet", 353, 3, "Kagebouzu"); // Shadow Monk
static Pokemon Banette = new Pokemon("Banette", 354, 3, "Juppeta"); // Puppet
static Pokemon MegaBanette = new Pokemon("Mega Banette", 354, 6, "Juppeta");
static Pokemon Duskull = new Pokemon("Duskull", 355, 3, "Yomawaru"); // Night Watcher
static Pokemon Dusclops = new Pokemon("Dusclops", 356, 3, "Samayouru"); // Wandering Spirit
static Pokemon Tropius = new Pokemon("Tropius", 357, 3, "Tropius"); // Same name
static Pokemon Chimecho = new Pokemon("Chimecho", 358, 3, "Chirean"); // Wind Chime
static Pokemon Absol = new Pokemon("Absol", 359, 3, "Absol"); // Same name
static Pokemon MegaAbsol = new Pokemon("Mega Absol", 359, 6, "Absol");
static Pokemon Wynaut = new Pokemon("Wynaut", 360, 3, "Sonano"); // "That's so?"
static Pokemon Snorunt = new Pokemon("Snorunt", 361, 3, "Yukiwarashi"); // Snow Child
static Pokemon Glalie = new Pokemon("Glalie", 362, 3, "Onigohri"); // Demon Ice
static Pokemon MegaGlalie = new Pokemon("Mega Glalie", 362, 6, "Onigohri");
static Pokemon Spheal = new Pokemon("Spheal", 363, 3, "Tamazarashi"); // Ball Seal
static Pokemon Sealeo = new Pokemon("Sealeo", 364, 3, "Todoggler"); // Toddler + Seal
static Pokemon Walrein = new Pokemon("Walrein", 365, 3, "Todozeruga"); // Seal + Walrus
static Pokemon Clamperl = new Pokemon("Clamperl", 366, 3, "Pearlulu"); // Pearl
static Pokemon Huntail = new Pokemon("Huntail", 367, 3, "Huntail"); // Same name
static Pokemon Gorebyss = new Pokemon("Gorebyss", 368, 3, "Sakurabyss"); // Sakura + Abyss
static Pokemon Relicanth = new Pokemon("Relicanth", 369, 3, "Glanth"); // Ancient Fish
static Pokemon Luvdisc = new Pokemon("Luvdisc", 370, 3, "Lovecus"); // Love Kiss
static Pokemon Bagon = new Pokemon("Bagon", 371, 3, "Tatsubay"); // Dragon Child
static Pokemon Shelgon = new Pokemon("Shelgon", 372, 3, "Komoruu"); // Cocoon
static Pokemon Salamence = new Pokemon("Salamence", 373, 3, "Bohmander"); // Salamander
static Pokemon MegaSalamence = new Pokemon("Mega Salamence", 373, 6, "Bohmander");
static Pokemon Beldum = new Pokemon("Beldum", 374, 3, "Dumbber"); // Dumbbell
static Pokemon Metang = new Pokemon("Metang", 375, 3, "Metang"); // Same name
static Pokemon Metagross = new Pokemon("Metagross", 376, 3, "Metagross"); // Same name
static Pokemon MegaMetagross = new Pokemon("Mega Metagross", 376, 6, "Metagross");
static Pokemon Regirock = new Pokemon("Regirock", 377, 3, "Regirock"); // Same name
static Pokemon Regice = new Pokemon("Regice", 378, 3, "Regice"); // Same name
static Pokemon Registeel = new Pokemon("Registeel", 379, 3, "Registeel"); // Same name
static Pokemon Latias = new Pokemon("Latias", 380, 3, "Latias"); // Same name
static Pokemon MegaLatias = new Pokemon("Mega Latias", 380, 6, "Latias");
static Pokemon Latios = new Pokemon("Latios", 381, 3, "Latios"); // Same name
static Pokemon MegaLatios = new Pokemon("Mega Latios", 381, 6, "Latios");
static Pokemon Kyogre = new Pokemon("Kyogre", 382, 3, "Kyogre"); // Same name
static Pokemon PrimalKyogre = new Pokemon("Primal Kyogre", 382, 11, "Kyogre", "382_f2");
static Pokemon Groudon = new Pokemon("Groudon", 383, 3, "Groudon"); // Same name
static Pokemon PrimalGroudon = new Pokemon("Primal Groudon", 383, 11, "Groudon", "383_f2");
static Pokemon Rayquaza = new Pokemon("Rayquaza", 384, 3, "Rayquaza"); // Same name
static Pokemon MegaRayquaza = new Pokemon("Mega Rayquaza", 384, 6, "Rayquaza");
static Pokemon Jirachi = new Pokemon("Jirachi", 385, 3, "Jirachi"); // Wish
static Pokemon Deoxys = new Pokemon("Deoxys", 386, 3, "Deoxys"); // DNA
static Pokemon AttackFormDeoxys = new Pokemon("Deoxys Attack Form", 386, 10, "Deoxys", "386_f2");
static Pokemon DefenseFormDeoxys = new Pokemon("Deoxys Defense Form", 386, 10, "Deoxys", "386_f3");
static Pokemon SpeedFormDeoxys = new Pokemon("Deoxys Speed Form", 386, 10, "Deoxys", "386_f4");
static Pokemon Turtwig = new Pokemon("Turtwig", 387, 4, "Naetle"); // Nature + Turtle
static Pokemon Grotle = new Pokemon("Grotle", 388, 4, "Hayashigame"); // Forest Turtle
static Pokemon Torterra = new Pokemon("Torterra", 389, 4, "Dodaitose"); // Earth Turtle
static Pokemon Chimchar = new Pokemon("Chimchar", 390, 4, "Hikozaru"); // Fire Monkey
static Pokemon Monferno = new Pokemon("Monferno", 391, 4, "Moukazaru"); // Fierce Monkey
static Pokemon Infernape = new Pokemon("Infernape", 392, 4, "Goukazaru"); // Strong Fire Monkey
static Pokemon Piplup = new Pokemon("Piplup", 393, 4, "Pochama"); // Child Emperor
static Pokemon Prinplup = new Pokemon("Prinplup", 394, 4, "Pottaishi"); // Emperor Chick
static Pokemon Empoleon = new Pokemon("Empoleon", 395, 4, "Emperte"); // Emperor + Penguin
static Pokemon Starly = new Pokemon("Starly", 396, 4, "Mukkuru"); // Sparrow
static Pokemon Staravia = new Pokemon("Staravia", 397, 4, "Mukubird"); // Sparrow Bird
static Pokemon Staraptor = new Pokemon("Staraptor", 398, 4, "Mukuhawk"); // Hawk
static Pokemon Bidoof = new Pokemon("Bidoof", 399, 4, "Bippa"); // Beaver
static Pokemon Bibarel = new Pokemon("Bibarel", 400, 4, "Beadaru"); // Beaver + Barrel
static Pokemon Kricketot = new Pokemon("Kricketot", 401, 4, "Korobohshi"); // Cricket
static Pokemon Kricketune = new Pokemon("Kricketune", 402, 4, "Korotok"); // Cricket + Tock
static Pokemon Shinx = new Pokemon("Shinx", 403, 4, "Kolink"); // Coil + Link
static Pokemon Luxio = new Pokemon("Luxio", 404, 4, "Luxio"); // Same name
static Pokemon Luxray = new Pokemon("Luxray", 405, 4, "Rentorar"); // Emperor of Thunder
static Pokemon Budew = new Pokemon("Budew", 406, 4, "Subomie"); // Bud
static Pokemon Roserade = new Pokemon("Roserade", 407, 4, "Roserade"); // Rose + Masquerade
static Pokemon Cranidos = new Pokemon("Cranidos", 408, 4, "Zugaidos"); // Head Butt Dino
static Pokemon Rampardos = new Pokemon("Rampardos", 409, 4, "Rampard"); // Rampage Dino
static Pokemon Shieldon = new Pokemon("Shieldon", 410, 4, "Tatetops"); // Shield Face
static Pokemon Bastiodon = new Pokemon("Bastiodon", 411, 4, "Torideps"); // Fortress
static Pokemon PlantCloakBurmy = new Pokemon("Plant Cloak Burmy", 412, 4, "Minomucchi");
static Pokemon SandyCloakBurmy = new Pokemon("Sandy Cloak Burmy", 412, 4, "Minomucchi", "412_f2");
static Pokemon TrashCloakBurmy = new Pokemon("Trash Cloak Burmy", 412, 4, "Minomucchi", "412_f3");
static Pokemon PlantCloakWormadam = new Pokemon("Plant Cloak Wormadam", 413, 4, "Minomadam");
static Pokemon SandyCloakWormadam = new Pokemon("Sandy Cloak Wormadam", 413, 4, "Minomadam", "413_f2");
static Pokemon TrashCloakWormadam = new Pokemon("Trash Cloak Wormadam", 413, 4, "Minomadam", "414_f2");
static Pokemon Mothim = new Pokemon("Mothim", 414, 4, "Garmeil");
static Pokemon Combee = new Pokemon("Combee", 415, 4, "Mitsuhoney"); // Honeycomb
static Pokemon Vespiquen = new Pokemon("Vespiquen", 416, 4, "Beequeen"); // Bee Queen
static Pokemon Pachirisu = new Pokemon("Pachirisu", 417, 4, "Pachirisu"); // Squirrel
static Pokemon Buizel = new Pokemon("Buizel", 418, 4, "Buoysel"); // Buoy + Weasel
static Pokemon Floatzel = new Pokemon("Floatzel", 419, 4, "Floazel"); // Float + Weasel
static Pokemon Cherubi = new Pokemon("Cherubi", 420, 4, "Cherinbo"); // Cherry
static Pokemon Cherrim = new Pokemon("Cherrim", 421, 4, "Cherrim"); // Cherry Bloom
static Pokemon Shellos = new Pokemon("Shellos", 422, 4, "Karanakushi"); // Sea Slug
static Pokemon Gastrodon = new Pokemon("Gastrodon", 423, 4, "Tritodon"); // Triton + Don
static Pokemon Ambipom = new Pokemon("Ambipom", 424, 4, "Eteboth"); // Double Hand
static Pokemon Drifloon = new Pokemon("Drifloon", 425, 4, "Fuwante"); // Floating Child
static Pokemon Drifblim = new Pokemon("Drifblim", 426, 4, "Fuwaride"); // Floating Ride
static Pokemon Buneary = new Pokemon("Buneary", 427, 4, "Mimirol"); // Ear Roll
static Pokemon Lopunny = new Pokemon("Lopunny", 428, 4, "Mimilop"); // Ear Lop
static Pokemon MegaLopunny = new Pokemon("Mega Lopunny", 428, 6, "Mimilop");
static Pokemon Mismagius = new Pokemon("Mismagius", 429, 4, "Mumargi"); // Magic Ghost
static Pokemon Honchkrow = new Pokemon("Honchkrow", 430, 4, "Dongkarasu"); // Don Crow
static Pokemon Glameow = new Pokemon("Glameow", 431, 4, "Glameow"); // Same name
static Pokemon Purugly = new Pokemon("Purugly", 432, 4, "Buburn"); // Ugly Cat
static Pokemon Chingling = new Pokemon("Chingling", 433, 4, "Lisyan"); // Little Bell
static Pokemon Stunky = new Pokemon("Stunky", 434, 4, "Skunpuu"); // Skunk
static Pokemon Skuntank = new Pokemon("Skuntank", 435, 4, "Skutank"); // Skunk Tank
static Pokemon Bronzor = new Pokemon("Bronzor", 436, 4, "Dohmirror"); // Bronze Mirror
static Pokemon Bronzong = new Pokemon("Bronzong", 437, 4, "Dohtakun"); // Bronze Bell
static Pokemon Bonsly = new Pokemon("Bonsly", 438, 4, "Usohachi"); // Fake Tree Child
static Pokemon MimeJr = new Pokemon("Mime Jr.", 439, 4, "Manene"); // Mimic Child
static Pokemon Happiny = new Pokemon("Happiny", 440, 4, "Pinpuku"); // Pink Happiness
static Pokemon Chatot = new Pokemon("Chatot", 441, 4, "Perap"); // Parrot
static Pokemon Spiritomb = new Pokemon("Spiritomb", 442, 4, "Mikaruge"); // 108 Spirits
static Pokemon Gible = new Pokemon("Gible", 443, 4, "Fukamaru"); // Deep Bite
static Pokemon Gabite = new Pokemon("Gabite", 444, 4, "Gabite"); // Same name
static Pokemon Garchomp = new Pokemon("Garchomp", 445, 4, "Gaburias"); // Bite + Furious
static Pokemon MegaGarchomp = new Pokemon("Mega Garchomp", 445, 6, "Gaburias");
static Pokemon Munchlax = new Pokemon("Munchlax", 446, 4, "Gonbe"); // Little Glutton
static Pokemon Riolu = new Pokemon("Riolu", 447, 4, "Riolu"); // Same name
static Pokemon Lucario = new Pokemon("Lucario", 448, 4, "Lucario"); // Same name
static Pokemon MegaLucario = new Pokemon("Mega Lucario", 448, 6, "Lucario");
static Pokemon Hippopotas = new Pokemon("Hippopotas", 449, 4, "Hippopotas"); // Same name
static Pokemon Hippowdon = new Pokemon("Hippowdon", 450, 4, "Kabarudon"); // Hippo Don
static Pokemon Skorupi = new Pokemon("Skorupi", 451, 4, "Scorupi"); // Same name
static Pokemon Drapion = new Pokemon("Drapion", 452, 4, "Dorapion"); // Dragon + Scorpion
static Pokemon Croagunk = new Pokemon("Croagunk", 453, 4, "Gureggru"); // Croak
static Pokemon Toxicroak = new Pokemon("Toxicroak", 454, 4, "Dokurog"); // Poison Frog
static Pokemon Carnivine = new Pokemon("Carnivine", 455, 4, "Muskippa"); // Flytrap
static Pokemon Finneon = new Pokemon("Finneon", 456, 4, "Keikouo"); // Neon Fish
static Pokemon Lumineon = new Pokemon("Lumineon", 457, 4, "Neolant"); // Neon Lantern
static Pokemon Mantyke = new Pokemon("Mantyke", 458, 4, "Tamanta"); // Tiny Manta
static Pokemon Snover = new Pokemon("Snover", 459, 4, "Yukikaburi"); // Snow Covered
static Pokemon Abomasnow = new Pokemon("Abomasnow", 460, 4, "Yukinooh"); // Snow King
static Pokemon MegaAbomasnow = new Pokemon("Mega Abomasnow", 460, 6, "Yukinooh");
static Pokemon Weavile = new Pokemon("Weavile", 461, 4, "Manyula"); // Sneaky Claw
static Pokemon Magnezone = new Pokemon("Magnezone", 462, 4, "Jibacoil"); // Magnetic Coil
static Pokemon Lickilicky = new Pokemon("Lickilicky", 463, 4, "Berobelt"); // Long Tongue Belt
static Pokemon Rhyperior = new Pokemon("Rhyperior", 464, 4, "Dosidon"); // Spike Don
static Pokemon Tangrowth = new Pokemon("Tangrowth", 465, 4, "Mojumbo"); // Tangled Jumbo
static Pokemon Electivire = new Pokemon("Electivire", 466, 4, "Elekible"); // Electric Cable
static Pokemon Magmortar = new Pokemon("Magmortar", 467, 4, "Booburn"); // Boiling Burn
static Pokemon Togekiss = new Pokemon("Togekiss", 468, 4, "Togekiss"); // Same name
static Pokemon Yanmega = new Pokemon("Yanmega", 469, 4, "Megayanma"); // Giant Dragonfly
static Pokemon Leafeon = new Pokemon("Leafeon", 470, 4, "Leafia"); // Leaf
static Pokemon Glaceon = new Pokemon("Glaceon", 471, 4, "Glacia"); // Ice
static Pokemon Gliscor = new Pokemon("Gliscor", 472, 4, "Glion"); // Glide + Scorpion
static Pokemon Mamoswine = new Pokemon("Mamoswine", 473, 4, "Mammoo"); // Mammoth
static Pokemon Porygon_z = new Pokemon("Porygon-Z", 474, 4, "PorygonZ"); // Same name
static Pokemon Gallade = new Pokemon("Gallade", 475, 4, "Erureido"); // Blade Knight
static Pokemon MegaGallade = new Pokemon("Mega Gallade", 475, 6, "Erureido");
static Pokemon Probopass = new Pokemon("Probopass", 476, 4, "Dainose"); // Big Nose
static Pokemon Dusknoir = new Pokemon("Dusknoir", 477, 4, "Yonoir"); // Night Noir
static Pokemon Froslass = new Pokemon("Froslass", 478, 4, "Yukimenoko"); // Snow Woman
static Pokemon Rotom = new Pokemon("Rotom", 479, 4, "Rotom");
static Pokemon HeatRotom = new Pokemon("Heat Rotom", 479, 4, "Rotom", "479_f2");
static Pokemon WashRotom = new Pokemon("Wash Rotom", 479, 4, "Rotom", "479_f3");
static Pokemon FrostRotom = new Pokemon("Frost Rotom", 479, 4, "Rotom", "479_f4");
static Pokemon FanRotom = new Pokemon("Fan Rotom", 479, 4, "Rotom", "479_f5");
static Pokemon MowRotom = new Pokemon("Mow Rotom", 479, 4, "Rotom", "479_f6");
static Pokemon Uxie = new Pokemon("Uxie", 480, 4, "Yuxie"); // Knowledge
static Pokemon Mesprit = new Pokemon("Mesprit", 481, 4, "Emrit"); // Emotion
static Pokemon Azelf = new Pokemon("Azelf", 482, 4, "Agnome"); // Willpower
static Pokemon Dialga = new Pokemon("Dialga", 483, 4, "Dialga");
static Pokemon OriginFormeDialga = new Pokemon("Origin Forme Dialga", 483, 8, "Dialga", "483_f2");
static Pokemon Palkia = new Pokemon("Palkia", 484, 4, "Palkia");
static Pokemon OriginFormePalkia = new Pokemon("Origin Forme Palkia", 484, 8, "Palkia", "484_f2");
static Pokemon Heatran = new Pokemon("Heatran", 485, 4, "Heatran");
static Pokemon Regigigas = new Pokemon("Regigigas", 486, 4, "Regigigas");
static Pokemon AlteredFormeGiratina = new Pokemon("Altered Forme Giratina", 487, 4, "Giratina");
static Pokemon OriginFormeGiratina = new Pokemon("Origin Forme Giratina", 487, 4, "Giratina", "487_f2");

static Pokemon Cresselia = new Pokemon("Cresselia", 488, 4, "Cresselia");
static Pokemon Phione = new Pokemon("Phione", 489, 4, "Phione");
static Pokemon Manaphy = new Pokemon("Manaphy", 490, 4, "Manaphy");
static Pokemon Darkrai = new Pokemon("Darkrai", 491, 4, "Darkrai");
static Pokemon LandFormeShaymin = new Pokemon("Land Forme Shaymin", 492, 4, "Shaymin");
static Pokemon SkyFormeShaymin = new Pokemon("Sky Forme Shaymin", 492, 4, "Shaymin");
static Pokemon Arceus = new Pokemon("Arceus", 493, 4, "Arceus");
static Pokemon Victini = new Pokemon("Victini", 494, 5, "Victini");
static Pokemon Snivy = new Pokemon("Snivy", 495, 5, "Tsutarja");
static Pokemon Servine = new Pokemon("Servine", 496, 5, "Janovy");
static Pokemon Serperior = new Pokemon("Serperior", 497, 5, "Jalorda");
static Pokemon Tepig = new Pokemon("Tepig", 498, 5, "Pokabu");
static Pokemon Pignite = new Pokemon("Pignite", 499, 5, "Chaoboo");
static Pokemon Emboar = new Pokemon("Emboar", 500, 5, "Enbuoh");
static Pokemon Oshawott = new Pokemon("Oshawott", 501, 5, "Mijumaru");
static Pokemon Dewott = new Pokemon("Dewott", 502, 5, "Futachimaru");
static Pokemon Samurott = new Pokemon("Samurott", 503, 5, "Daikenki");
static Pokemon HisuianSamurott = new Pokemon("Hisuian Samurott", 503, 8, "Daikenki");
static Pokemon Patrat = new Pokemon("Patrat", 504, 5, "Minezumi");
static Pokemon Watchog = new Pokemon("Watchog", 505, 5, "Miruhog");
static Pokemon Lillipup = new Pokemon("Lillipup", 506, 5, "Yorterrie");
static Pokemon Herdier = new Pokemon("Herdier", 507, 5, "Herderrie");
static Pokemon Stoutland = new Pokemon("Stoutland", 508, 5, "Mooland");
static Pokemon Purrloin = new Pokemon("Purrloin", 509, 5, "Choroneko");
static Pokemon Liepard = new Pokemon("Liepard", 510, 5, "Lepardas");
static Pokemon Pansage = new Pokemon("Pansage", 511, 5, "Yanappu");
static Pokemon Simisage = new Pokemon("Simisage", 512, 5, "Yanakkie");
static Pokemon Pansear = new Pokemon("Pansear", 513, 5, "Baoppu");
static Pokemon Simisear = new Pokemon("Simisear", 514, 5, "Baokkie");
static Pokemon Panpour = new Pokemon("Panpour", 515, 5, "Hiyappu");
static Pokemon Simipour = new Pokemon("Simipour", 516, 5, "Hiyakkie");
static Pokemon Munna = new Pokemon("Munna", 517, 5, "Munna");
static Pokemon Musharna = new Pokemon("Musharna", 518, 5, "Musharna");
static Pokemon Pidove = new Pokemon("Pidove", 519, 5, "Mamepato");
static Pokemon Tranquill = new Pokemon("Tranquill", 520, 5, "Hatoboh");
static Pokemon Unfezant = new Pokemon("Unfezant", 521, 5, "Kenhallow");
static Pokemon Blitzle = new Pokemon("Blitzle", 522, 5, "Shimama");
static Pokemon Zebstrika = new Pokemon("Zebstrika", 523, 5, "Zebraika");
static Pokemon Roggenrola = new Pokemon("Roggenrola", 524, 5, "Dangoro");
static Pokemon Boldore = new Pokemon("Boldore", 525, 5, "Gantle");
static Pokemon Gigalith = new Pokemon("Gigalith", 526, 5, "Gigaiath");
static Pokemon Woobat = new Pokemon("Woobat", 527, 5, "Koromori");
static Pokemon Swoobat = new Pokemon("Swoobat", 528, 5, "Kokoromori");
static Pokemon Drilbur = new Pokemon("Drilbur", 529, 5, "Mogurew");
static Pokemon Excadrill = new Pokemon("Excadrill", 530, 5, "Doryuzu");
static Pokemon Audino = new Pokemon("Audino", 531, 5, "Tabunne");
static Pokemon MegaAudino = new Pokemon("Mega Audino", 531, 6, "Tabunne");
static Pokemon Timburr = new Pokemon("Timburr", 532, 5, "Dokkorer");
static Pokemon Gurdurr = new Pokemon("Gurdurr", 533, 5, "Dotekkotsu");
static Pokemon Conkeldurr = new Pokemon("Conkeldurr", 534, 5, "Roubushin");
static Pokemon Tympole = new Pokemon("Tympole", 535, 5, "Otamaro");
static Pokemon Palpitoad = new Pokemon("Palpitoad", 536, 5, "Gamagaru");
static Pokemon Seismitoad = new Pokemon("Seismitoad", 537, 5, "Gamageroge");
static Pokemon Throh = new Pokemon("Throh", 538, 5, "Nageki");
static Pokemon Sawk = new Pokemon("Sawk", 539, 5, "Dageki");
static Pokemon Sewaddle = new Pokemon("Sewaddle", 540, 5, "Kurumiru");
static Pokemon Swadloon = new Pokemon("Swadloon", 541, 5, "Kurumayu");
static Pokemon Leavanny = new Pokemon("Leavanny", 542, 5, "Hahakomori");
static Pokemon Venipede = new Pokemon("Venipede", 543, 5, "Fushide");
static Pokemon Whirlipede = new Pokemon("Whirlipede", 544, 5, "Wheega");
static Pokemon Scolipede = new Pokemon("Scolipede", 545, 5, "Pendror");
static Pokemon Cottonee = new Pokemon("Cottonee", 546, 5, "Monmen");
static Pokemon Whimsicott = new Pokemon("Whimsicott", 547, 5, "Elfuun");
static Pokemon Petilil = new Pokemon("Petilil", 548, 5, "Churine");
static Pokemon Lilligant = new Pokemon("Lilligant", 549, 5, "Dredear");
static Pokemon HisuianLilligant = new Pokemon("Hisuian Lilligant", 549, 8, "Dredear");
static Pokemon Basculin = new Pokemon("Basculin", 550, 5, "Bassrao");
static Pokemon White_StripedBasculin = new Pokemon("White-Striped Basculin", 550, 8, "Bassrao");
static Pokemon Sandile = new Pokemon("Sandile", 551, 5, "Meguroco");
static Pokemon Krokorok = new Pokemon("Krokorok", 552, 5, "Waruvile");
static Pokemon Krookodile = new Pokemon("Krookodile", 553, 5, "Waruvial");
static Pokemon Darumaka = new Pokemon("Darumaka", 554, 5, "Darumakka");
static Pokemon GalarianDarumaka = new Pokemon("Galarian Darumaka", 554, 8, "Darumakka");
static Pokemon Darmanitan = new Pokemon("Darmanitan", 555, 5, "Hihidaruma");
static Pokemon GalarianDarmanitan = new Pokemon("Galarian Darmanitan", 555, 8, "Hihidaruma");
static Pokemon Maractus = new Pokemon("Maractus", 556, 5, "Maracacchi");
static Pokemon Dwebble = new Pokemon("Dwebble", 557, 5, "Ishizumai");
static Pokemon Crustle = new Pokemon("Crustle", 558, 5, "Iwapalace");
static Pokemon Scraggy = new Pokemon("Scraggy", 559, 5, "Zuruggu");
static Pokemon Scrafty = new Pokemon("Scrafty", 560, 5, "Zuruzukin");
static Pokemon Sigilyph = new Pokemon("Sigilyph", 561, 5, "Symboler");
static Pokemon Yamask = new Pokemon("Yamask", 562, 5, "Desumasu");
static Pokemon GalarianYamask = new Pokemon("Galarian Yamask", 562, 8, "Desumasu");
static Pokemon Cofagrigus = new Pokemon("Cofagrigus", 563, 5, "Desukarn");
static Pokemon Tirtouga = new Pokemon("Tirtouga", 564, 5, "Protoga");
static Pokemon Carracosta = new Pokemon("Carracosta", 565, 5, "Abagoura");
static Pokemon Archen = new Pokemon("Archen", 566, 5, "Archen");
static Pokemon Archeops = new Pokemon("Archeops", 567, 5, "Archeos");
static Pokemon Trubbish = new Pokemon("Trubbish", 568, 5, "Yabukuron");
static Pokemon Garbodor = new Pokemon("Garbodor", 569, 5, "Dustdas");
static Pokemon Zorua = new Pokemon("Zorua", 570, 5, "Zorua");
static Pokemon HisuianZorua = new Pokemon("Hisuian Zorua", 570, 8, "Zorua");
static Pokemon Zoroark = new Pokemon("Zoroark", 571, 5, "Zoroark");
static Pokemon HisuianZoroark = new Pokemon("Hisuian Zoroark", 571, 8, "Zoroark");
static Pokemon Minccino = new Pokemon("Minccino", 572, 5, "Chillarmy");
static Pokemon Cinccino = new Pokemon("Cinccino", 573, 5, "Chillaccino");
static Pokemon Gothita = new Pokemon("Gothita", 574, 5, "Gothimu");
static Pokemon Gothorita = new Pokemon("Gothorita", 575, 5, "Gothimiru");
static Pokemon Gothitelle = new Pokemon("Gothitelle", 576, 5, "Gothiruselle");
static Pokemon Solosis = new Pokemon("Solosis", 577, 5, "Uniran");
static Pokemon Duosion = new Pokemon("Duosion", 578, 5, "Doublan");
static Pokemon Reuniclus = new Pokemon("Reuniclus", 579, 5, "Lanculus");
static Pokemon Ducklett = new Pokemon("Ducklett", 580, 5, "Koaruhie");
static Pokemon Swanna = new Pokemon("Swanna", 581, 5, "Swanna");
static Pokemon Vanillite = new Pokemon("Vanillite", 582, 5, "Vanipeti");
static Pokemon Vanillish = new Pokemon("Vanillish", 583, 5, "Vanirich");
static Pokemon Vanilluxe = new Pokemon("Vanilluxe", 584, 5, "Baivanilla");
static Pokemon Deerling = new Pokemon("Deerling", 585, 5, "Shikijika");
static Pokemon Sawsbuck = new Pokemon("Sawsbuck", 586, 5, "Mebukijika");
static Pokemon Emolga = new Pokemon("Emolga", 587, 5, "Emolga");
static Pokemon Karrablast = new Pokemon("Karrablast", 588, 5, "Kaburumo");
static Pokemon Escavalier = new Pokemon("Escavalier", 589, 5, "Chevargo");
static Pokemon Foongus = new Pokemon("Foongus", 590, 5, "Tamagetake");
static Pokemon Amoonguss = new Pokemon("Amoonguss", 591, 5, "Morobareru");
static Pokemon Frillish = new Pokemon("Frillish", 592, 5, "Pururill");
static Pokemon Jellicent = new Pokemon("Jellicent", 593, 5, "Burungel");
static Pokemon Alomomola = new Pokemon("Alomomola", 594, 5, "Mamanbou");
static Pokemon Joltik = new Pokemon("Joltik", 595, 5, "Bachuru");
static Pokemon Galvantula = new Pokemon("Galvantula", 596, 5, "Dentula");
static Pokemon Ferroseed = new Pokemon("Ferroseed", 597, 5, "Tesseed");
static Pokemon Ferrothorn = new Pokemon("Ferrothorn", 598, 5, "Nutrey");
static Pokemon Klink = new Pokemon("Klink", 599, 5, "Giaru");
static Pokemon Klang = new Pokemon("Klang", 600, 5, "Gigiaru");
static Pokemon Klinklang = new Pokemon("Klinklang", 601, 5, "Gigigiaru");
static Pokemon Tynamo = new Pokemon("Tynamo", 602, 5, "Shibishirasu");
static Pokemon Eelektrik = new Pokemon("Eelektrik", 603, 5, "Shibibeel");
static Pokemon Eelektross = new Pokemon("Eelektross", 604, 5, "Shibirudon");
static Pokemon Elgyem = new Pokemon("Elgyem", 605, 5, "Ligray");
static Pokemon Beheeyem = new Pokemon("Beheeyem", 606, 5, "Ohbem");
static Pokemon Litwick = new Pokemon("Litwick", 607, 5, "Hitomoshi");
static Pokemon Lampent = new Pokemon("Lampent", 608, 5, "Lampler");
static Pokemon Chandelure = new Pokemon("Chandelure", 609, 5, "Chandela");
static Pokemon Axew = new Pokemon("Axew", 610, 5, "Kibago");
static Pokemon Fraxure = new Pokemon("Fraxure", 611, 5, "Onondo");
static Pokemon Haxorus = new Pokemon("Haxorus", 612, 5, "Ononokus");
static Pokemon Cubchoo = new Pokemon("Cubchoo", 613, 5, "Kumasyun");
static Pokemon Beartic = new Pokemon("Beartic", 614, 5, "Tunbear");
static Pokemon Cryogonal = new Pokemon("Cryogonal", 615, 5, "Freegeo");
static Pokemon Shelmet = new Pokemon("Shelmet", 616, 5, "Chobomaki");
static Pokemon Accelgor = new Pokemon("Accelgor", 617, 5, "Agilder");
static Pokemon Stunfisk = new Pokemon("Stunfisk", 618, 5, "Maggyo");
static Pokemon GalarianStunfisk = new Pokemon("Galarian Stunfisk", 618, 8, "Maggyo");
static Pokemon Mienfoo = new Pokemon("Mienfoo", 619, 5, "Kojofu");
static Pokemon Mienshao = new Pokemon("Mienshao", 620, 5, "Kojondo");
static Pokemon Druddigon = new Pokemon("Druddigon", 621, 5, "Crimgan");
static Pokemon Golett = new Pokemon("Golett", 622, 5, "Gobit");
static Pokemon Golurk = new Pokemon("Golurk", 623, 5, "Goloog");
static Pokemon Pawniard = new Pokemon("Pawniard", 624, 5, "Komatana");
static Pokemon Bisharp = new Pokemon("Bisharp", 625, 5, "Kirikizan");
static Pokemon Bouffalant = new Pokemon("Bouffalant", 626, 5, "Buffron");
static Pokemon Rufflet = new Pokemon("Rufflet", 627, 5, "Washibon");
static Pokemon Braviary = new Pokemon("Braviary", 628, 5, "Warrgle");
static Pokemon HisuianBraviary = new Pokemon("Hisuian Braviary", 628, 8, "Warrgle");
static Pokemon Vullaby = new Pokemon("Vullaby", 629, 5, "Valchai");
static Pokemon Mandibuzz = new Pokemon("Mandibuzz", 630, 5, "Vulgina");
static Pokemon Heatmor = new Pokemon("Heatmor", 631, 5, "Kuitaran");
static Pokemon Durant = new Pokemon("Durant", 632, 5, "Aiant");
static Pokemon Deino = new Pokemon("Deino", 633, 5, "Monozu");
static Pokemon Zweilous = new Pokemon("Zweilous", 634, 5, "Dihead");
static Pokemon Hydreigon = new Pokemon("Hydreigon", 635, 5, "Sazandora");
static Pokemon Larvesta = new Pokemon("Larvesta", 636, 5, "Merlarva");
static Pokemon Volcarona = new Pokemon("Volcarona", 637, 5, "Ulgamoth");
static Pokemon Cobalion = new Pokemon("Cobalion", 638, 5, "Cobalon");
static Pokemon Terrakion = new Pokemon("Terrakion", 639, 5, "Terrakion");
static Pokemon Virizion = new Pokemon("Virizion", 640, 5, "Virizion");
static Pokemon IncarnateFormeTornadus = new Pokemon("Incarnate Forme Tornadus", 641, 5, "Tornelos");
static Pokemon TherianFormeTornadus = new Pokemon("Therian Forme Tornadus", 641, 5, "Tornelos");
static Pokemon IncarnateFormeThundurus = new Pokemon("Incarnate Forme Thundurus", 642, 5, "Voltolos");
static Pokemon TherianFormeThundurus = new Pokemon("Therian Forme Thundurus", 642, 5, "Voltolos");
static Pokemon Reshiram = new Pokemon("Reshiram", 643, 5, "Reshiram");
static Pokemon Zekrom = new Pokemon("Zekrom", 644, 5, "Zekrom");
static Pokemon IncarnateFormeLandorus = new Pokemon("Incarnate Forme Landorus", 645, 5, "Landlos");
static Pokemon TherianFormeLandorus = new Pokemon("Therian Forme Landorus", 645, 5, "Landlos");
static Pokemon Kyurem = new Pokemon("Kyurem", 646, 5, "Kyurem");
static Pokemon WhiteKyurem = new Pokemon("White Kyurem", 646, 5, "Kyurem");
static Pokemon BlackKyurem = new Pokemon("Black Kyurem", 646, 5, "Kyurem");
static Pokemon OrdinaryFormKeldeo = new Pokemon("Ordinary Form Keldeo", 647, 5, "Keldeo");
static Pokemon ResoluteFormKeldeo = new Pokemon("Resolute Form Keldeo", 647, 5, "Keldeo");
static Pokemon AriaFormeMeloetta = new Pokemon("Aria Forme Meloetta", 648, 5, "Meloetta");
static Pokemon PirouetteFormeMeloetta = new Pokemon("Pirouette Forme Meloetta", 648, 5, "Meloetta");
static Pokemon Genesect = new Pokemon("Genesect", 649, 5, "Genesect");
static Pokemon Chespin = new Pokemon("Chespin", 650, 6, "Harimaron");
static Pokemon Quilladin = new Pokemon("Quilladin", 651, 6, "Hariborg");
static Pokemon Chesnaught = new Pokemon("Chesnaught", 652, 6, "Brigarron");
static Pokemon Fennekin = new Pokemon("Fennekin", 653, 6, "Fokko");
static Pokemon Braixen = new Pokemon("Braixen", 654, 6, "Tairenar");
static Pokemon Delphox = new Pokemon("Delphox", 655, 6, "Mahoxy");
static Pokemon Froakie = new Pokemon("Froakie", 656, 6, "Keromatsu");
static Pokemon Frogadier = new Pokemon("Frogadier", 657, 6, "Gekogashira");
static Pokemon Greninja = new Pokemon("Greninja", 658, 6, "Gekkouga");
static Pokemon Bunnelby = new Pokemon("Bunnelby", 659, 6, "Horubee");
static Pokemon Diggersby = new Pokemon("Diggersby", 660, 6, "Horudo");
static Pokemon Fletchling = new Pokemon("Fletchling", 661, 6, "Yayakoma");
static Pokemon Fletchinder = new Pokemon("Fletchinder", 662, 6, "Hinoyakoma");
static Pokemon Talonflame = new Pokemon("Talonflame", 663, 6, "Fiarrow");
static Pokemon Scatterbug = new Pokemon("Scatterbug", 664, 6, "Kofukimushi");
static Pokemon Spewpa = new Pokemon("Spewpa", 665, 6, "Kofuurai");
static Pokemon Vivillon = new Pokemon("Vivillon", 666, 6, "Viviyon");
static Pokemon Litleo = new Pokemon("Litleo", 667, 6, "Shishiko");
static Pokemon Pyroar = new Pokemon("Pyroar", 668, 6, "Kaenjishi");
static Pokemon Flabebe = new Pokemon("Flabebe", 669, 6, "Flabebe");
static Pokemon Floette = new Pokemon("Floette", 670, 6, "Floette");
static Pokemon Florges = new Pokemon("Florges", 671, 6, "Florges");
static Pokemon Skiddo = new Pokemon("Skiddo", 672, 6, "Meecle");
static Pokemon Gogoat = new Pokemon("Gogoat", 673, 6, "Gogoat");
static Pokemon Pancham = new Pokemon("Pancham", 674, 6, "Yancham");
static Pokemon Pangoro = new Pokemon("Pangoro", 675, 6, "Goronda");
static Pokemon Furfrou = new Pokemon("Furfrou", 676, 6, "Trimmien");
static Pokemon Espurr = new Pokemon("Espurr", 677, 6, "Nyasper");
static Pokemon Meowstic = new Pokemon("Meowstic", 678, 6, "Nyaonix");
static Pokemon Honedge = new Pokemon("Honedge", 679, 6, "Hitotsuki");
static Pokemon Doublade = new Pokemon("Doublade", 680, 6, "Nidangill");
static Pokemon Aegislash = new Pokemon("Aegislash", 681, 6, "Gillgard");
static Pokemon Spritzee = new Pokemon("Spritzee", 682, 6, "Shushupu");
static Pokemon Aromatisse = new Pokemon("Aromatisse", 683, 6, "Frefuwan");
static Pokemon Swirlix = new Pokemon("Swirlix", 684, 6, "Peroppafu");
static Pokemon Slurpuff = new Pokemon("Slurpuff", 685, 6, "Peroream");
static Pokemon Inkay = new Pokemon("Inkay", 686, 6, "Maaiika");
static Pokemon Malamar = new Pokemon("Malamar", 687, 6, "Calamanero");
static Pokemon Binacle = new Pokemon("Binacle", 688, 6, "Kametete");
static Pokemon Barbaracle = new Pokemon("Barbaracle", 689, 6, "Gamenodes");
static Pokemon Skrelp = new Pokemon("Skrelp", 690, 6, "Kuzumo");
static Pokemon Dragalge = new Pokemon("Dragalge", 691, 6, "Dramidoro");
static Pokemon Clauncher = new Pokemon("Clauncher", 692, 6, "Udeppou");
static Pokemon Clawitzer = new Pokemon("Clawitzer", 693, 6, "Bloster");
static Pokemon Helioptile = new Pokemon("Helioptile", 694, 6, "Erikiteru");
static Pokemon Heliolisk = new Pokemon("Heliolisk", 695, 6, "Elezard");
static Pokemon Tyrunt = new Pokemon("Tyrunt", 696, 6, "Chigoras");
static Pokemon Tyrantrum = new Pokemon("Tyrantrum", 697, 6, "Gachigoras");
static Pokemon Amaura = new Pokemon("Amaura", 698, 6, "Amarus");
static Pokemon Aurorus = new Pokemon("Aurorus", 699, 6, "Amaruruga");
static Pokemon Sylveon = new Pokemon("Sylveon", 700, 6, "Nymphia");
static Pokemon Hawlucha = new Pokemon("Hawlucha", 701, 6, "Luchabull");
static Pokemon Dedenne = new Pokemon("Dedenne", 702, 6, "Dedenne");
static Pokemon Carbink = new Pokemon("Carbink", 703, 6, "Melecie");
static Pokemon Goomy = new Pokemon("Goomy", 704, 6, "Numera");
static Pokemon Sliggoo = new Pokemon("Sliggoo", 705, 6, "Numeil");
static Pokemon HisuianSliggoo = new Pokemon("Hisuian Sliggoo", 705, 8, "Numeil");
static Pokemon Goodra = new Pokemon("Goodra", 706, 6, "Numelgon");
static Pokemon HisuianGoodra = new Pokemon("Hisuian Goodra", 706, 8, "Numelgon");
static Pokemon Klefki = new Pokemon("Klefki", 707, 6, "Cleffy");
static Pokemon Phantump = new Pokemon("Phantump", 708, 6, "Bokurei");
static Pokemon Trevenant = new Pokemon("Trevenant", 709, 6, "Ohrot");
static Pokemon Pumpkaboo = new Pokemon("Pumpkaboo", 710, 6, "Bakeccha");
static Pokemon Gourgeist = new Pokemon("Gourgeist", 711, 6, "Pumpjin");
static Pokemon Bergmite = new Pokemon("Bergmite", 712, 6, "Kachikohru");
static Pokemon Avalugg = new Pokemon("Avalugg", 713, 6, "Crebase");
static Pokemon HisuianAvalugg = new Pokemon("Hisuian Avalugg", 713, 8, "Crebase");
static Pokemon Noibat = new Pokemon("Noibat", 714, 6, "Onbat");
static Pokemon Noivern = new Pokemon("Noivern", 715, 6, "Onvern");
static Pokemon Xerneas = new Pokemon("Xerneas", 716, 6, "Xerneas");
static Pokemon Yveltal = new Pokemon("Yveltal", 717, 6, "Yveltal");
static Pokemon Zygarde50Forme = new Pokemon("50% Forme Zygarde", 718, 6, "Zygarde");
static Pokemon Zygarde10Forme = new Pokemon("10% Forme Zygarde", 718, 7, "Zygarde");
static Pokemon ZygardeCompleteForme = new Pokemon("Complete Forme Zygarde", 718, 7, "Zygarde");
static Pokemon Diancie = new Pokemon("Diancie", 719, 6, "Diancie");
static Pokemon MegaDiancie = new Pokemon("Mega Diancie", 719, 6, "Diancie");
static Pokemon ConfinedHoopa = new Pokemon("Confined Hoopa", 720, 6, "Hoopa");
static Pokemon UnboundHoopa = new Pokemon("Unbound Hoopa", 720, 6, "Hoopa");
static Pokemon Volcanion = new Pokemon("Volcanion", 721, 6, "Volcanion");
static Pokemon Rowlet = new Pokemon("Rowlet", 722, 7, "Mokuroh");
static Pokemon Dartrix = new Pokemon("Dartrix", 723, 7, "Fukuthrow");
static Pokemon Decidueye = new Pokemon("Decidueye", 724, 7, "Junaiper");
static Pokemon HisuianDecidueye = new Pokemon("Hisuian Decidueye", 724, 8, "Junaiper");
static Pokemon Litten = new Pokemon("Litten", 725, 7, "Nyabby");
static Pokemon Torracat = new Pokemon("Torracat", 726, 7, "Nyaheat");
static Pokemon Incineroar = new Pokemon("Incineroar", 727, 7, "Gaogaen");
static Pokemon Popplio = new Pokemon("Popplio", 728, 7, "Ashimari");
static Pokemon Brionne = new Pokemon("Brionne", 729, 7, "Osyamari");
static Pokemon Primarina = new Pokemon("Primarina", 730, 7, "Ashirene");
static Pokemon Pikipek = new Pokemon("Pikipek", 731, 7, "Tsutsukera");
static Pokemon Trumbeak = new Pokemon("Trumbeak", 732, 7, "Kerarappa");
static Pokemon Toucannon = new Pokemon("Toucannon", 733, 7, "Dodekabashi");
static Pokemon Yungoos = new Pokemon("Yungoos", 734, 7, "Youngoose");
static Pokemon Gumshoos = new Pokemon("Gumshoos", 735, 7, "Dekagoose");
static Pokemon Grubbin = new Pokemon("Grubbin", 736, 7, "Agojimushi");
static Pokemon Charjabug = new Pokemon("Charjabug", 737, 7, "Dendimushi");
static Pokemon Vikavolt = new Pokemon("Vikavolt", 738, 7, "Kuwagannon");
static Pokemon Crabrawler = new Pokemon("Crabrawler", 739, 7, "Makenkani");
static Pokemon Crabominable = new Pokemon("Crabominable", 740, 7, "Kekenkani");
static Pokemon BaileStyleOricorio = new Pokemon("Baile Style Oricorio", 741, 7, "Odoridori");
static Pokemon Pom_PomStyleOricorio = new Pokemon("Pom-Pom Style Oricorio", 741, 7, "Odoridori");
static Pokemon PauStyleOricorio = new Pokemon("Pa'u Style Oricorio", 741, 7, "Odoridori");
static Pokemon SensuStyleOricorio = new Pokemon("Sensu Style Oricorio", 741, 7, "Odoridori");
static Pokemon Cutiefly = new Pokemon("Cutiefly", 742, 7, "Abuly");
static Pokemon Ribombee = new Pokemon("Ribombee", 743, 7, "Aburibbon");
static Pokemon Rockruff = new Pokemon("Rockruff", 744, 7, "Iwanko");
static Pokemon MiddayFormLycanroc = new Pokemon("Midday Form Lycanroc", 745, 7, "Lugarugan");
static Pokemon MidnightFormLycanroc = new Pokemon("Midnight Form Lycanroc", 745, 7, "Lugarugan");
static Pokemon DuskFormLycanroc = new Pokemon("Dusk Form Lycanroc", 745, 7, "Lugarugan");
static Pokemon Wishiwashi = new Pokemon("Wishiwashi", 746, 7, "Yowashi");
static Pokemon Mareanie = new Pokemon("Mareanie", 747, 7, "Hidoide");
static Pokemon Toxapex = new Pokemon("Toxapex", 748, 7, "Dohidoide");
static Pokemon Mudbray = new Pokemon("Mudbray", 749, 7, "Dorobanko");
static Pokemon Mudsdale = new Pokemon("Mudsdale", 750, 7, "Banbadoro");
static Pokemon Dewpider = new Pokemon("Dewpider", 751, 7, "Shizukumo");
static Pokemon Araquanid = new Pokemon("Araquanid", 752, 7, "Onishizukumo");
static Pokemon Fomantis = new Pokemon("Fomantis", 753, 7, "Karikiri");
static Pokemon Lurantis = new Pokemon("Lurantis", 754, 7, "Lalantes");
static Pokemon Morelull = new Pokemon("Morelull", 755, 7, "Nemasyu");
static Pokemon Shiinotic = new Pokemon("Shiinotic", 756, 7, "Mashade");
static Pokemon Salandit = new Pokemon("Salandit", 757, 7, "Yatoumori");
static Pokemon Salazzle = new Pokemon("Salazzle", 758, 7, "Ennewt");
static Pokemon Stufful = new Pokemon("Stufful", 759, 7, "Nuikoguma");
static Pokemon Bewear = new Pokemon("Bewear", 760, 7, "Kiteruguma");
static Pokemon Bounsweet = new Pokemon("Bounsweet", 761, 7, "Amakaji");
static Pokemon Steenee = new Pokemon("Steenee", 762, 7, "Amamaiko");
static Pokemon Tsareena = new Pokemon("Tsareena", 763, 7, "Amajo");
static Pokemon Comfey = new Pokemon("Comfey", 764, 7, "Cuwawa");
static Pokemon Oranguru = new Pokemon("Oranguru", 765, 7, "Yareyuutan");
static Pokemon Passimian = new Pokemon("Passimian", 766, 7, "Nagetukesaru");
static Pokemon Wimpod = new Pokemon("Wimpod", 767, 7, "Kosokumushi");
static Pokemon Golisopod = new Pokemon("Golisopod", 768, 7, "Gusokumusha");
static Pokemon Sandygast = new Pokemon("Sandygast", 769, 7, "Sunaba");
static Pokemon Palossand = new Pokemon("Palossand", 770, 7, "Sirodethna");
static Pokemon Pyukumuku = new Pokemon("Pyukumuku", 771, 7, "Namakobushi");
static Pokemon Type_null = new Pokemon("Type-null", 772, 7, "Type:Null");
static Pokemon Silvally = new Pokemon("Silvally", 773, 7, "Silvady");
static Pokemon Minior = new Pokemon("Minior", 774, 7, "Meteno");
static Pokemon Komala = new Pokemon("Komala", 775, 7, "Nekkoara");
static Pokemon Turtonator = new Pokemon("Turtonator", 776, 7, "Bakugames");
static Pokemon Togedemaru = new Pokemon("Togedemaru", 777, 7, "Togedemaru");
static Pokemon Mimikyu = new Pokemon("Mimikyu", 778, 7, "Mimikkyu");
static Pokemon Bruxish = new Pokemon("Bruxish", 779, 7, "Hagigishiri");
static Pokemon Drampa = new Pokemon("Drampa", 780, 7, "Jijilong");
static Pokemon Dhelmise = new Pokemon("Dhelmise", 781, 7, "Dadarin");
static Pokemon Jangmo_o = new Pokemon("Jangmo-o", 782, 7, "Jyarako");
static Pokemon Hakamo_o = new Pokemon("Hakamo-o", 783, 7, "Jyarango");
static Pokemon Kommo_o = new Pokemon("Kommo-o", 784, 7, "Jyararanga");
static Pokemon Tapu_koko = new Pokemon("Tapu-koko", 785, 7, "Kapu-Kokeko");
static Pokemon Tapu_lele = new Pokemon("Tapu-lele", 786, 7, "Kapu-Tetefu");
static Pokemon Tapu_bulu = new Pokemon("Tapu-bulu", 787, 7, "Kapu-Bulul");
static Pokemon Tapu_fini = new Pokemon("Tapu-fini", 788, 7, "Kapu-Rehire");
static Pokemon Cosmog = new Pokemon("Cosmog", 789, 7, "Cosmog");
static Pokemon Cosmoem = new Pokemon("Cosmoem", 790, 7, "Cosmovum");
static Pokemon Solgaleo = new Pokemon("Solgaleo", 791, 7, "Solgaleo");
static Pokemon Lunala = new Pokemon("Lunala", 792, 7, "Lunala");
static Pokemon Nihilego = new Pokemon("Nihilego", 793, 7, "Uturoid");
static Pokemon Buzzwole = new Pokemon("Buzzwole", 794, 7, "Massivoon");
static Pokemon Pheromosa = new Pokemon("Pheromosa", 795, 7, "Pheroache");
static Pokemon Xurkitree = new Pokemon("Xurkitree", 796, 7, "Denjyumoku");
static Pokemon Celesteela = new Pokemon("Celesteela", 797, 7, "Tekkaguya");
static Pokemon Kartana = new Pokemon("Kartana", 798, 7, "Kamiturugi");
static Pokemon Guzzlord = new Pokemon("Guzzlord", 799, 7, "Akuziking");
static Pokemon Necrozma = new Pokemon("Necrozma", 800, 7, "Necrozma");
static Pokemon DuskManeNecrozma = new Pokemon("Dusk Mane Necrozma", 800, 7, "Necrozma");
static Pokemon DawnWingsNecrozma = new Pokemon("Dawn Wings Necrozma", 800, 7, "Necrozma");
static Pokemon UltraNecrozma = new Pokemon("Ultra Necrozma", 800, 7, "Necrozma");
static Pokemon Magearna = new Pokemon("Magearna", 801, 7, "Magearna");
static Pokemon Marshadow = new Pokemon("Marshadow", 802, 7, "Marshadow");
static Pokemon Poipole = new Pokemon("Poipole", 803, 7, "Bevenom");
static Pokemon Naganadel = new Pokemon("Naganadel", 804, 7, "Agoyon");
static Pokemon Stakataka = new Pokemon("Stakataka", 805, 7, "Tundetunde");
static Pokemon Blacephalon = new Pokemon("Blacephalon", 806, 7, "Zugadoon");
static Pokemon Zeraora = new Pokemon("Zeraora", 807, 7, "Zeraora");
static Pokemon Meltan = new Pokemon("Meltan", 808, 7, "Meltan");
static Pokemon Melmetal = new Pokemon("Melmetal", 809, 7, "Melmetal");
static Pokemon Grookey = new Pokemon("Grookey", 810, 8, "Sarunori");
static Pokemon Thwackey = new Pokemon("Thwackey", 811, 8, "Bachinkey");
static Pokemon Rillaboom = new Pokemon("Rillaboom", 812, 8, "Gorirander");
static Pokemon Scorbunny = new Pokemon("Scorbunny", 813, 8, "Hibanny");
static Pokemon Raboot = new Pokemon("Raboot", 814, 8, "Rabbifuto");
static Pokemon Cinderace = new Pokemon("Cinderace", 815, 8, "Aceburn");
static Pokemon Sobble = new Pokemon("Sobble", 816, 8, "Messon");
static Pokemon Drizzile = new Pokemon("Drizzile", 817, 8, "Jimereon");
static Pokemon Inteleon = new Pokemon("Inteleon", 818, 8, "Intereon");
static Pokemon Skwovet = new Pokemon("Skwovet", 819, 8, "Hoshigarisu");
static Pokemon Greedent = new Pokemon("Greedent", 820, 8, "Yokubarisu");
static Pokemon Rookidee = new Pokemon("Rookidee", 821, 8, "Kokogara");
static Pokemon Corvisquire = new Pokemon("Corvisquire", 822, 8, "Aogarasu");
static Pokemon Corviknight = new Pokemon("Corviknight", 823, 8, "Armorga");
static Pokemon Blipbug = new Pokemon("Blipbug", 824, 8, "Sacchimushi");
static Pokemon Dottler = new Pokemon("Dottler", 825, 8, "Redomushi");
static Pokemon Orbeetle = new Pokemon("Orbeetle", 826, 8, "Eolb");
static Pokemon Nickit = new Pokemon("Nickit", 827, 8, "Kusune");
static Pokemon Thievul = new Pokemon("Thievul", 828, 8, "Foxly");
static Pokemon Gossifleur = new Pokemon("Gossifleur", 829, 8, "Himenka");
static Pokemon Eldegoss = new Pokemon("Eldegoss", 830, 8, "Watashiraga");
static Pokemon Wooloo = new Pokemon("Wooloo", 831, 8, "Wooluu");
static Pokemon Dubwool = new Pokemon("Dubwool", 832, 8, "Baiwooluu");
static Pokemon Chewtle = new Pokemon("Chewtle", 833, 8, "Kamukame");
static Pokemon Drednaw = new Pokemon("Drednaw", 834, 8, "Kajirigame");
static Pokemon Yamper = new Pokemon("Yamper", 835, 8, "Wanpachi");
static Pokemon Boltund = new Pokemon("Boltund", 836, 8, "Pulsewan");
static Pokemon Rolycoly = new Pokemon("Rolycoly", 837, 8, "Tandon");
static Pokemon Carkol = new Pokemon("Carkol", 838, 8, "Toroggon");
static Pokemon Coalossal = new Pokemon("Coalossal", 839, 8, "Sekitanzan");
static Pokemon Applin = new Pokemon("Applin", 840, 8, "Kajicchu");
static Pokemon Flapple = new Pokemon("Flapple", 841, 8, "Appryu");
static Pokemon Appletun = new Pokemon("Appletun", 842, 8, "Tarupple");
static Pokemon Silicobra = new Pokemon("Silicobra", 843, 8, "Sunahebi");
static Pokemon Sandaconda = new Pokemon("Sandaconda", 844, 8, "Sadaija");
static Pokemon Cramorant = new Pokemon("Cramorant", 845, 8, "Uu");
static Pokemon Arrokuda = new Pokemon("Arrokuda", 846, 8, "Sasikamasu");
static Pokemon Barraskewda = new Pokemon("Barraskewda", 847, 8, "Kamasujaw");
static Pokemon Toxel = new Pokemon("Toxel", 848, 8, "Eleson");
static Pokemon AmpedFormToxtricity = new Pokemon("Amped Form Toxtricity", 849, 8, "Strinder");
static Pokemon LowKeyFormToxtricity = new Pokemon("Low Key Form Toxtricity", 849, 8, "Strinder");
static Pokemon Sizzlipede = new Pokemon("Sizzlipede", 850, 8, "Yakude");
static Pokemon Centiskorch = new Pokemon("Centiskorch", 851, 8, "Maruyakude");
static Pokemon Clobbopus = new Pokemon("Clobbopus", 852, 8, "Tatakko");
static Pokemon Grapploct = new Pokemon("Grapploct", 853, 8, "Otosupus");
static Pokemon Sinistea = new Pokemon("Sinistea", 854, 8, "Yabacha");
static Pokemon Polteageist = new Pokemon("Polteageist", 855, 8, "Potdeath");
static Pokemon Hatenna = new Pokemon("Hatenna", 856, 8, "Mibrim");
static Pokemon Hattrem = new Pokemon("Hattrem", 857, 8, "Tebrim");
static Pokemon Hatterene = new Pokemon("Hatterene", 858, 8, "Brimuon");
static Pokemon Impidimp = new Pokemon("Impidimp", 859, 8, "Beroba");
static Pokemon Morgrem = new Pokemon("Morgrem", 860, 8, "Gimoh");
static Pokemon Grimmsnarl = new Pokemon("Grimmsnarl", 861, 8, "Ohlonge");
static Pokemon Obstagoon = new Pokemon("Obstagoon", 862, 8, "Tachifusaguma");
static Pokemon Perrserker = new Pokemon("Perrserker", 863, 8, "Nyaiking");
static Pokemon Cursola = new Pokemon("Cursola", 864, 8, "Sunigoon");
static Pokemon Sirfetchd = new Pokemon("Sirfetchd", 865, 8, "Negigaknight");
static Pokemon Mr_rime = new Pokemon("Mr-rime", 866, 8, "Barrikohru");
static Pokemon Runerigus = new Pokemon("Runerigus", 867, 8, "Deathbarn");
static Pokemon Milcery = new Pokemon("Milcery", 868, 8, "Mahomil");
static Pokemon Alcremie = new Pokemon("Alcremie", 869, 8, "Mawhip");
static Pokemon Falinks = new Pokemon("Falinks", 870, 8, "Tairetsu");
static Pokemon Pincurchin = new Pokemon("Pincurchin", 871, 8, "Bachinuni");
static Pokemon Snom = new Pokemon("Snom", 872, 8, "Yukihami");
static Pokemon Frosmoth = new Pokemon("Frosmoth", 873, 8, "Mothnow");
static Pokemon Stonjourner = new Pokemon("Stonjourner", 874, 8, "Ishihengin");
static Pokemon Eiscue = new Pokemon("Eiscue", 875, 8, "Korippo");
static Pokemon Indeedee = new Pokemon("Indeedee", 876, 8, "Yessan");
static Pokemon Morpeko = new Pokemon("Full Belly Mode Morpeko", 877, 8, "Morpeko");
static Pokemon Cufant = new Pokemon("Cufant", 878, 8, "Zoudou");
static Pokemon Copperajah = new Pokemon("Copperajah", 879, 8, "Daioudou");
static Pokemon Dracozolt = new Pokemon("Dracozolt", 880, 8, "Patchiragon");
static Pokemon Arctozolt = new Pokemon("Arctozolt", 881, 8, "Patchilldon");
static Pokemon Dracovish = new Pokemon("Dracovish", 882, 8, "Uonoragon");
static Pokemon Arctovish = new Pokemon("Arctovish", 883, 8, "Uochilldon");
static Pokemon Duraludon = new Pokemon("Duraludon", 884, 8, "Duraludon");
static Pokemon Dreepy = new Pokemon("Dreepy", 885, 8, "Dorameshiya");
static Pokemon Drakloak = new Pokemon("Drakloak", 886, 8, "Doronch");
static Pokemon Dragapult = new Pokemon("Dragapult", 887, 8, "Dorapult");
static Pokemon HeroofManyBattlesZacian = new Pokemon("Hero of Many Battles \nZacian", 888, 8, "Zacian");
static Pokemon CrownedSwordZacian = new Pokemon("Crowned Sword Zacian", 888, 8, "Zacian");
static Pokemon HeroofManyBattlesZamazenta = new Pokemon("Hero of Many Battles \nZamazenta", 889, 8, "Zamazenta");
static Pokemon CrownedShieldZamazenta = new Pokemon("Crowned Shield Zamazenta", 889, 8, "Zamazenta");
static Pokemon Eternatus = new Pokemon("Eternatus", 890, 8, "Mugendina");
static Pokemon EternamaxEternatus = new Pokemon("Eternamax Eternatus", 890, 8, "Mugendina");
static Pokemon Kubfu = new Pokemon("Kubfu", 891, 8, "Dakuma");
static Pokemon SingleStrikeStyleUrshifu = new Pokemon("Single Strike Style \nUrshifu", 892, 8, "Wulaosu");
static Pokemon RapidStrikeStyleUrshifu = new Pokemon("Rapid Strike Style \nUrshifu", 892, 8, "Wulaosu");
static Pokemon Zarude = new Pokemon("Zarude", 893, 8, "Zarude");
static Pokemon Regieleki = new Pokemon("Regieleki", 894, 8, "Regieleki");
static Pokemon Regidrago = new Pokemon("Regidrago", 895, 8, "Regidorago");
static Pokemon Glastrier = new Pokemon("Glastrier", 896, 8, "Blizzapos");
static Pokemon Spectrier = new Pokemon("Spectrier", 897, 8, "Wraithpos");
static Pokemon Calyrex = new Pokemon("Calyrex", 898, 8, "Budrex");
static Pokemon IceRiderCalyrex = new Pokemon("Ice Rider Calyrex", 898, 8, "Budrex");
static Pokemon ShadowRiderCalyrex = new Pokemon("Shadow Rider Calyrex", 898, 8, "Budrex");
static Pokemon Wyrdeer = new Pokemon("Wyrdeer", 899, 8, "Ayashishi");
static Pokemon Kleavor = new Pokemon("Kleavor", 900, 8, "Basagiri");
static Pokemon Ursaluna = new Pokemon("Ursaluna", 901, 8, "Gachiguma");
static Pokemon BloodmoonUrsaluna = new Pokemon("Bloodmoon Ursaluna", 901, 9, "Gachiguma");
static Pokemon Basculegion = new Pokemon("Basculegion", 902, 8, "Idaitou");
static Pokemon Sneasler = new Pokemon("Sneasler", 903, 8, "Ohnyula");
static Pokemon Overqwil = new Pokemon("Overqwil", 904, 8, "Haryman");
static Pokemon IncarnateFormeEnamorus = new Pokemon("Incarnate Forme Enamorus", 905, 8, "Lovetolos");
static Pokemon TherianFormeEnamorus = new Pokemon("Therian Forme Enamorus", 905, 8, "Lovetolos");
static Pokemon Sprigatito = new Pokemon("Sprigatito", 906, 9, "Nyahoja");
static Pokemon Floragato = new Pokemon("Floragato", 907, 9, "Nyarote");
static Pokemon Meowscarada = new Pokemon("Meowscarada", 908, 9, "Masquernya");
static Pokemon Fuecoco = new Pokemon("Fuecoco", 909, 9, "Hogator");
static Pokemon Crocalor = new Pokemon("Crocalor", 910, 9, "Achigator");
static Pokemon Skeledirge = new Pokemon("Skeledirge", 911, 9, "Laudbon");
static Pokemon Quaxly = new Pokemon("Quaxly", 912, 9, "Kuwassu");
static Pokemon Quaxwell = new Pokemon("Quaxwell", 913, 9, "Welkamo");
static Pokemon Quaquaval = new Pokemon("Quaquaval", 914, 9, "Wanival");
static Pokemon Lechonk = new Pokemon("Lechonk", 915, 9, "Gourton");
static Pokemon Oinkologne = new Pokemon("Oinkologne", 916, 9, "Perfuton");
static Pokemon Tarountula = new Pokemon("Tarountula", 917, 9, "Tamantula");
static Pokemon Spidops = new Pokemon("Spidops", 918, 9, "Wanaider");
static Pokemon Nymble = new Pokemon("Nymble", 919, 9, "Mamebatt");
static Pokemon Lokix = new Pokemon("Lokix", 920, 9, "Exleg");
static Pokemon Pawmi = new Pokemon("Pawmi", 921, 9, "Pamo");
static Pokemon Pawmo = new Pokemon("Pawmo", 922, 9, "Pamot");
static Pokemon Pawmot = new Pokemon("Pawmot", 923, 9, "Parmot");
static Pokemon Tandemaus = new Pokemon("Tandemaus", 924, 9, "Wakkanezumi");
static Pokemon Maushold = new Pokemon("Maushold", 925, 9, "Ikkanezumi");
static Pokemon Fidough = new Pokemon("Fidough", 926, 9, "Pupamocchi");
static Pokemon Dachsbun = new Pokemon("Dachsbun", 927, 9, "Bowtzel");
static Pokemon Smoliv = new Pokemon("Smoliv", 928, 9, "Minive");
static Pokemon Dolliv = new Pokemon("Dolliv", 929, 9, "Olinyo");
static Pokemon Arboliva = new Pokemon("Arboliva", 930, 9, "Oliva");
static Pokemon Squawkabilly = new Pokemon("Squawkabilly", 931, 9, "Ikirinko");
static Pokemon Nacli = new Pokemon("Nacli", 932, 9, "Kojio");
static Pokemon Naclstack = new Pokemon("Naclstack", 933, 9, "Jiodumu");
static Pokemon Garganacl = new Pokemon("Garganacl", 934, 9, "Kyojiohn");
static Pokemon Charcadet = new Pokemon("Charcadet", 935, 9, "Carbou");
static Pokemon Armarouge = new Pokemon("Armarouge", 936, 9, "Gurenarma");
static Pokemon Ceruledge = new Pokemon("Ceruledge", 937, 9, "Soublades");
static Pokemon Tadbulb = new Pokemon("Tadbulb", 938, 9, "Zupika");
static Pokemon Bellibolt = new Pokemon("Bellibolt", 939, 9, "Harabarie");
static Pokemon Wattrel = new Pokemon("Wattrel", 940, 9, "Kaiden");
static Pokemon Kilowattrel = new Pokemon("Kilowattrel", 941, 9, "Taikaiden");
static Pokemon Maschiff = new Pokemon("Maschiff", 942, 9, "Orachifu");
static Pokemon Mabosstiff = new Pokemon("Mabosstiff", 943, 9, "Mafitiff");
static Pokemon Shroodle = new Pokemon("Shroodle", 944, 9, "Shirushrew");
static Pokemon Grafaiai = new Pokemon("Grafaiai", 945, 9, "Taggingru");
static Pokemon Bramblin = new Pokemon("Bramblin", 946, 9, "Anokusa");
static Pokemon Brambleghast = new Pokemon("Brambleghast", 947, 9, "Anohoragusa");
static Pokemon Toedscool = new Pokemon("Toedscool", 948, 9, "Nonokurage");
static Pokemon Toedscruel = new Pokemon("Toedscruel", 949, 9, "Rikukurage");
static Pokemon Klawf = new Pokemon("Klawf", 950, 9, "Gakegani");
static Pokemon Capsakid = new Pokemon("Capsakid", 951, 9, "Capsaiji");
static Pokemon Scovillain = new Pokemon("Scovillain", 952, 9, "Scovillain");
static Pokemon Rellor = new Pokemon("Rellor", 953, 9, "Shigaroko");
static Pokemon Rabsca = new Pokemon("Rabsca", 954, 9, "Beracas");
static Pokemon Flittle = new Pokemon("Flittle", 955, 9, "Hirahina");
static Pokemon Espathra = new Pokemon("Espathra", 956, 9, "Cuespatra");
static Pokemon Tinkatink = new Pokemon("Tinkatink", 957, 9, "Kanuchan");
static Pokemon Tinkatuff = new Pokemon("Tinkatuff", 958, 9, "Nakanuchan");
static Pokemon Tinkaton = new Pokemon("Tinkaton", 959, 9, "Dekanuchan");
static Pokemon Wiglett = new Pokemon("Wiglett", 960, 9, "Umidigda");
static Pokemon Wugtrio = new Pokemon("Wugtrio", 961, 9, "Umitrio");
static Pokemon Bombirdier = new Pokemon("Bombirdier", 962, 9, "Otoshidori");
static Pokemon Finizen = new Pokemon("Finizen", 963, 9, "Namiiruka");
static Pokemon Palafin = new Pokemon("Palafin", 964, 9, "Irukaman");
static Pokemon Varoom = new Pokemon("Varoom", 965, 9, "Buroron");
static Pokemon Revavroom = new Pokemon("Revavroom", 966, 9, "Burororoom");
static Pokemon Cyclizar = new Pokemon("Cyclizar", 967, 9, "Mototokage");
static Pokemon Orthworm = new Pokemon("Orthworm", 968, 9, "Mimizuzu");
static Pokemon Glimmet = new Pokemon("Glimmet", 969, 9, "Kirame");
static Pokemon Glimmora = new Pokemon("Glimmora", 970, 9, "Kiraflor");
static Pokemon Greavard = new Pokemon("Greavard", 971, 9, "Bochi");
static Pokemon Houndstone = new Pokemon("Houndstone", 972, 9, "Hakadog");
static Pokemon Flamigo = new Pokemon("Flamigo", 973, 9, "Karamingo");
static Pokemon Cetoddle = new Pokemon("Cetoddle", 974, 9, "Arukujira");
static Pokemon Cetitan = new Pokemon("Cetitan", 975, 9, "Hulkujira");
static Pokemon Veluza = new Pokemon("Veluza", 976, 9, "Migalusa");
static Pokemon Dondozo = new Pokemon("Dondozo", 977, 9, "Heyrusher");
static Pokemon Tatsugiri = new Pokemon("Tatsugiri", 978, 9, "Syaritatsu");
static Pokemon Annihilape = new Pokemon("Annihilape", 979, 9, "Konoyozaru");
static Pokemon Clodsire = new Pokemon("Clodsire", 980, 9, "Dooh");
static Pokemon Farigiraf = new Pokemon("Farigiraf", 981, 9, "Rikikirin");
static Pokemon Dudunsparce = new Pokemon("Dudunsparce", 982, 9, "Nokokocchi");
static Pokemon Kingambit = new Pokemon("Kingambit", 983, 9, "Dodogezan");
static Pokemon Great_tusk = new Pokemon("Great-tusk", 984, 9, "Idainakiba");
static Pokemon Scream_tail = new Pokemon("Scream-tail", 985, 9, "Sakebushippo");
static Pokemon Brute_bonnet = new Pokemon("Brute-bonnet", 986, 9, "Araburutake");
static Pokemon Flutter_mane = new Pokemon("Flutter-mane", 987, 9, "Habatakukami");
static Pokemon Slither_wing = new Pokemon("Slither-wing", 988, 9, "Chiwohauhane");
static Pokemon Sandy_shocks = new Pokemon("Sandy-shocks", 989, 9, "Sunanokegawa");
static Pokemon Iron_treads = new Pokemon("Iron-treads", 990, 9, "Tetsunowadachi");
static Pokemon Iron_bundle = new Pokemon("Iron-bundle", 991, 9, "Tetsunotsutsumi");
static Pokemon Iron_hands = new Pokemon("Iron-hands", 992, 9, "Tetsunokaina");
static Pokemon Iron_jugulis = new Pokemon("Iron-jugulis", 993, 9, "Tetsunokoube");
static Pokemon Iron_moth = new Pokemon("Iron-moth", 994, 9, "Tetsunodokuga");
static Pokemon Iron_thorns = new Pokemon("Iron-thorns", 995, 9, "Tetsunoibara");
static Pokemon Frigibax = new Pokemon("Frigibax", 996, 9, "Sebie");
static Pokemon Arctibax = new Pokemon("Arctibax", 997, 9, "Segohru");
static Pokemon Baxcalibur = new Pokemon("Baxcalibur", 998, 9, "Seglaive");
static Pokemon Gimmighoul = new Pokemon("Gimmighoul", 999, 9, "Collecurei");
static Pokemon Gholdengo = new Pokemon("Gholdengo", 1000, 9, "Surfugo");
static Pokemon Wo_chien = new Pokemon("Wo-chien", 1001, 9, "Chionjen");
static Pokemon Chien_pao = new Pokemon("Chien-pao", 1002, 9, "Paojian");
static Pokemon Ting_lu = new Pokemon("Ting-lu", 1003, 9, "Dinlu");
static Pokemon Chi_yu = new Pokemon("Chi-yu", 1004, 9, "Yiyui");
static Pokemon Roaring_moon = new Pokemon("Roaring-moon", 1005, 9, "Todorokutsuki");
static Pokemon Iron_valiant = new Pokemon("Iron-valiant", 1006, 9, "Tetsunobujin");
static Pokemon Koraidon = new Pokemon("Koraidon", 1007, 9, "Koraidon");
static Pokemon Miraidon = new Pokemon("Miraidon", 1008, 9, "Miraidon");
static Pokemon Walking_wake = new Pokemon("Walking-wake", 1009, 9, "Uneruminamo");
static Pokemon Iron_leaves = new Pokemon("Iron-leaves", 1010, 9, "Tetsunoisaha");
static Pokemon Dipplin = new Pokemon("Dipplin", 1011, 9, "Kamicchu");
static Pokemon Poltchageist = new Pokemon("Poltchageist", 1012, 9, "Chadeath");
static Pokemon Sinistcha = new Pokemon("Sinistcha", 1013, 9, "Yabasocha");
static Pokemon Okidogi = new Pokemon("Okidogi", 1014, 9, "Iineinu");
static Pokemon Munkidori = new Pokemon("Munkidori", 1015, 9, "Mashimashira");
static Pokemon Fezandipiti = new Pokemon("Fezandipiti", 1016, 9, "Kichikigisu");
static Pokemon TealMaskOgerpon = new Pokemon("Teal Mask Ogerpon", 1017, 9, "Ogerpon");
static Pokemon WellspringMaskOgerpon = new Pokemon("Wellspring Mask Ogerpon", 1017, 9, "Ogerpon");
static Pokemon HearthflameMaskOgerpon = new Pokemon("Hearthflame Mask Ogerpon", 1017, 9, "Ogerpon");
static Pokemon CornerstoneMaskOgerpon = new Pokemon("Cornerstone Mask Ogerpon", 1017, 9, "Ogerpon");
static Pokemon Archaludon = new Pokemon("Archaludon", 1018, 9, "Briduras");
static Pokemon Hydrapple = new Pokemon("Hydrapple", 1019, 9, "Kamitsuorochi");
static Pokemon Gouging_fire = new Pokemon("Gouging-fire", 1020, 9, "Ugatsuhomura");
static Pokemon Raging_bolt = new Pokemon("Raging-bolt", 1021, 9, "Takeruraiko");
static Pokemon Iron_boulder = new Pokemon("Iron-boulder", 1022, 9, "Tetsunoiwao");
static Pokemon Iron_crown = new Pokemon("Iron-crown", 1023, 9, "Tetsunokashira");
static Pokemon NormalFormTerapagos = new Pokemon("Normal Form Terapagos", 1024, 9, "Terapagos");
static Pokemon TerastalFormTerapagos = new Pokemon("Terastal Form Terapagos", 1024, 9, "Terapagos");
static Pokemon StellarFormTerapagos = new Pokemon("Stellar Form Terapagos", 1024, 9, "Terapagos");







        Pokemon[] gen9Pokedex = {Meowscarada, Skeledirge, Quaquaval, Oinkologne, Spidops, Lokix, Jumpluff, Talonflame, Pawmot, Houndoom, Gumshoos, Greedent, Sunflora,
                             Kricketune, Vivillon, Vespiquen, Corviknight, Blissey, Azumarill, Masquerain, Floatzel, Clodsire, Golduck, Drednaw, Wigglytuff, Gardevoir,
                             Gallade, Hypno, Gengar, Maushold, Raichu, Dachsbun, Slaking, Tsareena, Arboliva, Sudowoodo, MiddayFormLycanroc, DuskFormLycanroc, MidnightFormLycanroc,
                             Coalossal, Luxray, Staraptor, Pom_PomStyleOricorio, PauStyleOricorio, SensuStyleOricorio, BaileStyleOricorio, Ampharos, Lilligant, HisuianLilligant, Breloom,
                             Appletun, Flapple, Grumpig, Squawkabilly, Mismagius, Hariyama, Crabominable, Salazzle, Donphan, Copperajah, Garchomp, Garganacl, Pelipper,
                             Gyarados, Barraskewda, Basculin, Swalot, Persian, AlolanPersian, Perrserker, Drifblim, Florges, Dugtrio, Torkoal, Camerupt, Bronzong, Haxorus,
                             Annihilape, Medicham, Lucario, Armarouge, Ceruledge, Whiscash, Bellibolt, Goodra, HisuianGoodra, Toxicroak, Kilowattrel, Vaporeon, Jolteon,
                             Flareon, Espeon, Umbreon, Leafeon, Glaceon, Sylveon, Dudunsparce, Sawsbuck, Farigiraf, Muk, Altaria, Gogoat, CombatBreedTauros, BlazeBreedTauros,
                             AquaBreedTauros, Pyroar, Skuntank, Zoroark, HisuianZoroark, Weavile, Honchkrow, Gothitelle, Polteageist, Mimikyu, Klefki, Indeedee,
                             Brambleghast, Toedscruel, Tropius, Lurantis, Klawf, Scovillain, Cacturne, Rabsca, Venomoth, Forretress, Scizor, Heracross, Espathra, Hippowdon,
                             Krookodile, Sandaconda, Mudsdale, Volcarona, Salamence, Tinkaton, Hatterene, Grimmsnarl, Wugtrio, Bombirdier, Palafin, Revavroom, Cyclizar,
                             Orthworm, Sableye, Banette, Falinks, Hawlucha, Spiritomb, Noivern, Dragapult, Glimmora, Rotom, MowRotom, WashRotom, FrostRotom,
                             HeatRotom, FanRotom, Houndstone, Oranguru, Passimian, Komala, Tyranitar, Stonjourner, Eiscue, Pincurchin, Palossand, Slowbro,
                             Slowking, Gastrodon, Cloyster, Qwilfish, Luvdisc, Lumineon, Bruxish, Alomomola, Dragalge, Clawitzer, Eelektross, Toxapex,
                             Flamigo, Dragonite, Frosmoth, Abomasnow, Delibird, Beartic, Glalie, Froslass, Cryogonal, Cetitan, Avalugg, Braviary, HisuianBraviary,
                             Kingambit, Hydreigon, Veluza, Dondozo, Tatsugiri, Great_tusk, Scream_tail, Brute_bonnet, Flutter_mane, Slither_wing, Sandy_shocks, Iron_treads,
                             Iron_bundle, Iron_hands, Iron_jugulis, Iron_moth, Iron_thorns, Baxcalibur, Gholdengo, Wo_chien, Chien_pao, Ting_lu, Chi_yu, Roaring_moon, Iron_valiant,
                             Koraidon, Miraidon, Ariados, Yanmega, Quagsire, Mightyena, Volbeat, Illumise, Crawdaunt, Leavanny, Ribombee, Arbok, Victreebel, Furret, Dipplin,
                             Ninetales, Poliwrath, Politoed, Noctowl, Ambipom, Mamoswine, Shiftry, Trevenant, Sinistcha, HisuianArcanine, Conkeldurr, Morpeko,
                             Snorlax, Ludicolo, Probopass, Vikavolt, Sandslash, Gliscor, Mandibuzz, Kommo_o, Weezing, Mienshao, Dusknoir, Chimecho, Magcargo,
                             Chandelure, Clefable, Milotic, Carbink, Sneasler, Swanna, Cramorant, Basculegion, Ursaluna, Okidogi, Munkidori, Fezandipiti,
                             TealMaskOgerpon, Dodrio, Exeggcute, AlolanExeggutor, Rhyperior, Electivire, Magmortar, Kleavor, CombatBreedTauros, Zebstrika, Smeargle,
                             Alcremie, Flygon, Toucannon, Tentacruel, Kingdra, Whimsicott, Comfey, Vileplume, Bellossom, AlolanDugtrio, AlolanMuk, GalarianSlowbro,
                             GalarianSlowking, Lanturn, Malamar, Araquanid, Hitmonlee, Hitmonchan, Hitmontop, Golem, AlolanGolem, Excadrill, Meowstic, Minior,
                             Rampardos, Bastiodon, Cinccino, Skarmory, Plusle, Minun, Scrafty, Golurk, Porygon_z, Galvantula, Metagross, Dewgong, Lapras, Overqwil, Reuniclus,
                             Granbull, AlolanSandslash, Ninetales, Archaludon, Hydrapple, Venusaur, Charizard, Blastoise, Meganium, Typhlosion, HisuianTyphlosion,
                             Feraligatr, Sceptile, Blaziken, Swampert, Torterra, Infernape, Empoleon, Serperior, Emboar, Samurott, HisuianSamurott, Chesnaught, Delphox,
                             Greninja, Decidueye, HisuianDecidueye, Incineroar, Primarina, Rillaboom, Cinderace, Inteleon, Gouging_fire, Raging_bolt, Iron_crown, Iron_boulder,
                             NormalFormTerapagos, Walking_wake, Iron_leaves, Pachirisu, Articuno, GalarianArticuno, Zapdos, GalarianZapdos, Moltres, GalarianMoltres,
                             Mewtwo, Mew, Raikou, Entei, Suicune, Lugia, Ho_oh, Latias, Latios, Regirock, Registeel, Regice, Kyogre, Groudon, Rayquaza, Deoxys, AttackFormDeoxys,
                             DefenseFormDeoxys, SpeedFormDeoxys, Jirachi, Dialga, OriginFormeDialga, Palkia, OriginFormePalkia, AlteredFormeGiratina, OriginFormeGiratina, Uxie, Mesprit, Azelf, Heatran,
                             Regigigas, Cresselia, Darkrai, Manaphy, Phione, LandFormeShaymin, SkyFormeShaymin, Arceus, IncarnateFormeTornadus, TherianFormeTornadus, IncarnateFormeThundurus,
                             TherianFormeThundurus, IncarnateFormeLandorus, TherianFormeLandorus, IncarnateFormeEnamorus, TherianFormeEnamorus, Zekrom, Reshiram, Kyurem, BlackKyurem, WhiteKyurem,
                             Cobalion, Terrakion, Virizion, AriaFormeMeloetta, PirouetteFormeMeloetta, OrdinaryFormKeldeo, ResoluteFormKeldeo, ConfinedHoopa, UnboundHoopa, Diancie, Volcanion,
                             Solgaleo, Lunala, Necrozma, DuskManeNecrozma, DawnWingsNecrozma, Magearna, HeroofManyBattlesZacian, CrownedSwordZacian, HeroofManyBattlesZamazenta,
                             CrownedShieldZamazenta, Eternatus, RapidStrikeStyleUrshifu, SingleStrikeStyleUrshifu, Calyrex, ShadowRiderCalyrex, IceRiderCalyrex, Glastrier, Spectrier, Regieleki,
                             Regidrago, Zarude, Sprigatito, Floragato, Fuecoco, Crocalor, Quaxly, Quaxwell, Lechonk, Tarountula, Nymble, Hoppip, Skiploom, Fletchling, Fletchinder,
                             Pawmi, Pawmo, Houndour, Yungoos, Skwovet, Sunkern, Kricketot, Scatterbug, Spewpa, Combee, Rookidee, Corvisquire, Happiny, Chansey, Azurill, Marill,
                             Surskit, Buizel, PaldeanWooper, Psyduck, Chewtle, Igglybuff, Jigglypuff, Ralts, Kirlia, Drowzee, Gastly, Haunter, Tandemaus, Pichu, Pikachu, Fidough,
                             Slakoth, Vigoroth, Bounsweet, Steenee, Smoliv, Dolliv, Bonsly, Rockruff, Rolycoly, Carkol, Shinx, Luxio, Starly, Staravia, Mareep, Flaaffy, Petilil,
                             Shroomish, Applin, Spoink, Misdreavus, Makuhita, Crabrawler, Salandit, Phanpy, Cufant, Gible, Gabite, Nacli, Naclstack, Wingull, Magikarp, Arrokuda, Gulpin,
                             Meowth, AlolanMeowth, GalarianMeowth, Drifloon, Floette, Diglett, Numel, Bronzor, Axew, Mankey, Primeape, Meditite, Riolu,
                             Charcadet, Barboach, Tadbulb, Goomy, Sliggoo, HisuianSliggoo, Croagunk, Wattrel, Eevee, Dunsparce, Deerling, Girafarig, Grimer, Maschiff, Foongus,
                             Voltorb, HisuianVoltorb, Magnemite, Magneton, Growlithe, Teddiursa, Swablu, Skiddo, Litleo, Stunky, Zorua, HisuianZorua, Sneasel, Murkrow, Gothita,
                             Gothorita, Sinistea, Bramblin, Toedscool, Fomantis, Capsakid, Cacnea, Rellor, Venonat, Pineco, Scyther, Jynx, Flittle, Hippopotas, Sandile, Krokorok, Silicobra,
                             Mudbray, Larvesta, Bagon, Shelgon, Tinkatink, Tinkatuff, Hatenna, Hattrem, Impidimp, Morgrem, Wiglett, Finizen, Varoom, Shuppet, Noibat, Dreepy, Drakloak,
                             Glimmet, Greavard, Larvitar, Pupitar, Sandygast, Slowpoke, Shellos, Shellder, Finneon, Skrelp, Clauncher, Tynamo, Eelektrik, Mareanie, Dratini,
                             Dragonair, Snom, Snover, Pawniard, Bisharp, Deino, Zweilous, Gimmighoul, Spinarak, Yanma, Wooper, Poochyena, Corphish, Sewaddle, Swadloon, Cutiefly, Ekans,
                             Bellsprout, Weepinbell, Sentret, Vulpix, Poliwag, Poliwhirl, Hoothoot, Aipom, Swinub, Piloswine, Seedot, Nuzleaf, Phantump, Poltchageist, HisuianGrowlithe,
                             Timburr, Gurdurr, Munchlax, Lotad, Lombre, Nosepass, Grubbin, Charjabug, Sandshrew, Gligar, Vullaby, Jangmo_o, Kommo_o, Koffing, Mienfoo, Duskull, Dusclops,
                             Chingling, Slugma, Litwick, Lampent, Cleffa, Clefairy, Feebas, HisuianSneasel, Ducklett, White_StripedBasculin, Doduo, Exeggcute, Rhyhorn, Rhydon, Elekid,
                             Electabuzz, Magby, Magmar, Blitzle, Milcery, Trapinch, Vibrava, Pikipek, Trumbeak, Tentacool, Horsea, Seadra, Cottonee, Oddish, Gloom, AlolanDiglett,
                             AlolanGrimer, GalarianSlowbro, Chinchou, Inkay, Dewpider, Tyrogue, Geodude, AlolanGeodude, Graveler, AlolanGraveler, Drilbur, Espurr, Cranidos, Shieldon,
                             Minccino, Scraggy, Golett, Porygon, Porygon2, Joltik, Beldum, Metang, Seel, Solosis, Duosion, Snubbull, AlolanSandshrew, AlolanVulpix, Duraludon, Bulbasaur,
                             Ivysaur, Squirtle, Wartortle, Charmander, Charmeleon, Chikorita, Bayleef, Cyndaquil, Quilava, Totodile, Croconaw, Mudkip, Marshtomp, Torchic, Combusken,
                             Treecko, Grovyle, Turtwig, Grotle, Chimchar, Monferno, Piplup, Prinplup, Snivy, Servine, Tepig, Pignite, Oshawott, Dewott, Chespin, Quilladin, Fennekin,
                             Braixen, Froakie, Frogadier, Rowlet, Dartrix, Litten, Torracat, Popplio, Brionne, Grookey, Thwackey, Scorbunny, Raboot, Sobble, Drizzile, Cosmog, Cosmoem,
                             Ursaring, Amoonguss, Fraxure, Rufflet, Bergmite, HisuianAvalugg, Toxel, LowKeyFormToxtricity, AmpedFormToxtricity, Kubfu, Mabosstiff, Shroodle, Grafaiai, Cetoddle,
                             Frigibax, Arctibax
                         };

    Pokemon[] gen10Pokedex = {};

    Pokemon[] testPokedex = {Calyrex, ShadowRiderCalyrex, IceRiderCalyrex};

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
    public Image getColor(int index) {
        return pokedex[index].color;
    }
    public Image getShiny(int index) {
        return pokedex[index].shiny;
    }
    public Text getSpecies(int index) {
        return new Text(pokedex[index].getSpecies());
    }
    public String getHighestStat(LinkedHashMap<String, Integer> stats) {
        return sortedStats(stats).getLast() + ": " + stats.get(sortedStats(stats).getLast());

    }
    public String getLowestStat(LinkedHashMap<String, Integer> stats) {
        return sortedStats(stats).getFirst() + ": " + stats.get(sortedStats(stats).getFirst());
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

}
