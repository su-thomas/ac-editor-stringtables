package utils.processors

import kotlin.reflect.KClass

val processors: Map<Byte, KClass<out MessageProcessor>> =
        mapOf(
                Pair(LAST_CODE, LastProcessor::class),
                Pair(CONTINUE_CODE, ContinueProcessor::class),
                Pair(CLEAR_CODE, ClearProcessor::class),
                Pair(PAUSE_CODE, PauseProcessor::class),
                Pair(BUTTON_CODE, ButtonProcessor::class),
                Pair(COLOR_LINE_CODE, ColorLineProcessor::class),
                Pair(ABLE_CANCEL_CODE, AbleCancelProcessor::class),
                Pair(UNABLE_CANCEL_CODE, UnableCancelProcessor::class),
                Pair(SET_DEMO_ORDER_PLAYER_CODE, SetDemoOrderPlayerProcessor::class),
                Pair(SET_DEMO_ORDER_NPC0_CODE, SetDemoOrderNPC0Processor::class),
                Pair(SET_DEMO_ORDER_NPC1_CODE, SetDemoOrderNPC1Processor::class),
                Pair(SET_DEMO_ORDER_NPC2_CODE, SetDemoOrderNPC2Processor::class),
                Pair(SET_DEMO_ORDER_QUEST_CODE, SetDemoOrderQuestProcessor::class),
                Pair(SET_SELECT_WINDOW_CODE, SetSelectWindowProcessor::class),
                Pair(SET_NEXT_MESSAGEF_CODE, SetNextMessageFProcessor::class),
                Pair(SET_NEXT_MESSAGE0_CODE, SetNextMessage0Processor::class),
                Pair(SET_NEXT_MESSAGE1_CODE, SetNextMessage1Processor::class),
                Pair(SET_NEXT_MESSAGE2_CODE, SetNextMessage2Processor::class),
                Pair(SET_NEXT_MESSAGE3_CODE, SetNextMessage3Processor::class),
                Pair(SET_NEXT_MESSAGE_RANDOM2_CODE, SetNextMessageRandom2Processor::class),
                Pair(SET_NEXT_MESSAGE_RANDOM3_CODE, SetNextMessageRandom3Processor::class),
                Pair(SET_NEXT_MESSAGE_RANDOM4_CODE, SetNextMessageRandom4Processor::class),
                Pair(SET_SELECT_STRING2_CODE, SetSelectString2Processor::class),
                Pair(SET_SELECT_STRING3_CODE, SetSelectString3Processor::class),
                Pair(SET_SELECT_STRING4_CODE, SetSelectString4Processor::class),
                Pair(SET_FORCE_NEXT_CODE, SetForceNextProcessor::class),
                Pair(PLAYER_NAME_CODE, PlayerNameProcessor::class),
                Pair(TALK_NAME_CODE, TalkNameProcessor::class),
                Pair(TAIL_CODE, TailProcessor::class),
                Pair(YEAR_CODE, YearProcessor::class),
                Pair(MONTH_CODE, MonthProcessor::class),
                Pair(WEEKDAY_CODE, WeekdayProcessor::class),
                Pair(DAY_CODE, DayProcessor::class),
                Pair(HOUR_CODE, HourProcessor::class),
                Pair(MINUTE_CODE, MinuteProcessor::class),
                Pair(SECOND_CODE, SecondProcessor::class),
                Pair(FREE0_CODE, Free0Processor::class),
                Pair(FREE1_CODE, Free1Processor::class),
                Pair(FREE2_CODE, Free2Processor::class),
                Pair(FREE3_CODE, Free3Processor::class),
                Pair(FREE4_CODE, Free4Processor::class),
                Pair(FREE5_CODE, Free5Processor::class),
                Pair(FREE6_CODE, Free6Processor::class),
                Pair(FREE7_CODE, Free7Processor::class),
                Pair(FREE8_CODE, Free8Processor::class),
                Pair(FREE9_CODE, Free9Processor::class),
                Pair(DETERMINATION_CODE, DeterminationProcessor::class),
                Pair(TOWN_CODE, TownProcessor::class),
                Pair(RANDOM_NUMBER2_CODE, RandomNumber2Processor::class),
                Pair(ITEM0_CODE, Item0Processor::class),
                Pair(ITEM1_CODE, Item1Processor::class),
                Pair(ITEM2_CODE, Item2Processor::class),
                Pair(ITEM3_CODE, Item3Processor::class),
                Pair(ITEM4_CODE, Item4Processor::class),
                Pair(FREE10_CODE, Free10Processor::class),
                Pair(FREE11_CODE, Free11Processor::class),
                Pair(FREE12_CODE, Free12Processor::class),
                Pair(FREE13_CODE, Free13Processor::class),
                Pair(FREE14_CODE, Free14Processor::class),
                Pair(FREE15_CODE, Free15Processor::class),
                Pair(FREE16_CODE, Free16Processor::class),
                Pair(FREE17_CODE, Free17Processor::class),
                Pair(FREE18_CODE, Free18Processor::class),
                Pair(FREE19_CODE, Free19Processor::class),
                Pair(MAIL0_CODE, Mail0Processor::class),
                Pair(SET_PLAYER_DESTINY0_CODE, SetPlayerDestiny0Processor::class),
                Pair(SET_PLAYER_DESTINY1_CODE, SetPlayerDestiny1Processor::class),
                Pair(SET_PLAYER_DESTINY2_CODE, SetPlayerDestiny2Processor::class),
                Pair(SET_PLAYER_DESTINY3_CODE, SetPlayerDestiny3Processor::class),
                Pair(SET_PLAYER_DESTINY4_CODE, SetPlayerDestiny4Processor::class),
                Pair(SET_PLAYER_DESTINY5_CODE, SetPlayerDestiny5Processor::class),
                Pair(SET_PLAYER_DESTINY6_CODE, SetPlayerDestiny6Processor::class),
                Pair(SET_PLAYER_DESTINY7_CODE, SetPlayerDestiny7Processor::class),
                Pair(SET_PLAYER_DESTINY8_CODE, SetPlayerDestiny8Processor::class),
                Pair(SET_PLAYER_DESTINY9_CODE, SetPlayerDestiny9Processor::class),
                Pair(SET_MESSAGE_CONTENTS_NORMAL_CODE, SetMessageContentsNormalProcessor::class),
                Pair(SET_MESSAGE_CONTENTS_ANGRY_CODE, SetMessageContentsAngryProcessor::class),
                Pair(SET_MESSAGE_CONTENTS_SAD_CODE, SetMessageContentsSadProcessor::class),
                Pair(SET_MESSAGE_CONTENTS_FUN_CODE, SetMessageContentsFunProcessor::class),
                Pair(SET_MESSAGE_CONTENTS_SLEEPY_CODE, SetMessageContentsSleepyProcessor::class),
                Pair(SET_COLOR_CHAR_CODE, SetColorCharProcessor::class),
                Pair(SOUND_CUT_CODE, SoundCutProcessor::class),
                Pair(SET_LINE_OFFSET_CODE, SetLineOffsetProcessor::class),
                Pair(SET_LINE_TYPE_CODE, SetLineTypeProcessor::class)
        )
