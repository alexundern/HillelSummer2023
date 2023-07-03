package lesson_18.task;

import java.util.Arrays;
import java.util.stream.Collectors;

//В каждом предложении текста поменять местами первое слово с последним, не изменяя
//длины предложения.
public class WordChange {

    public final static String TEXT_R = "Следует отметить, что существующая теория позволяет выполнить важные задания по разработке соответствующих условий активизации. Сделанные на базе интернет-аналитики выводы в равной степени предоставлены сами себе. Принимая во внимание показатели успешности, базовый вектор развития предопределяет высокую востребованность позиций, занимаемых участниками в отношении поставленных задач. Господа, современная методология разработки обеспечивает актуальность поставленных обществом задач. И нет сомнений, что явные признаки победы институционализации, инициированные исключительно синтетически, подвергнуты целой серии независимых исследований. Высокий уровень вовлечения представителей целевой аудитории является четким доказательством простого факта: существующая теория способствует повышению качества приоритизации разума над эмоциями. Повседневная практика показывает, что сложившаяся структура организации создаёт необходимость включения в производственный план целого ряда внеочередных мероприятий с учётом комплекса модели развития. В целом, конечно, постоянное информационно-пропагандистское обеспечение нашей деятельности является качественно новой ступенью укрепления моральных ценностей. В частности, экономическая повестка сегодняшнего дня выявляет срочную потребность первоочередных требований. Таким образом, существующая теория в значительной степени обусловливает важность вывода текущих активов. Непосредственные участники технического прогресса могут быть подвергнуты целой серии независимых исследований. Сложившаяся структура организации играет важную роль в формировании стандартных подходов. Прежде всего, семантический разбор внешних противодействий играет определяющее значение для новых принципов формирования материально-технической и кадровой базы. Лишь предприниматели в сети интернет призывают нас к новым свершениям, которые, в свою очередь, должны быть ассоциативно распределены по отраслям. Безусловно, реализация намеченных плановых заданий требует определения и уточнения дальнейших направлений развития.";

    public static void main(String[] args) {
        String collect = Arrays.stream(TEXT_R.split("\\. ")).sequential().map(sent -> {
            System.out.println(sent);
            String[] words = sent.split(" ");
            String temp = words[words.length - 1];
            words[words.length - 1] = words[0].toLowerCase();
            words[0] = temp.replaceFirst(temp.substring(0, 1), temp.substring(0, 1).toUpperCase());

            sent = Arrays.stream(words).collect(Collectors.joining(" ", "", "."));
            System.out.println(sent);

            System.out.println(" ------ ");

            return sent;

        }).collect(Collectors.joining(" "));
        System.out.println("=========");
        System.out.println(collect);
    }
}
