package lesson3.dz1;

public interface CSVConverter {
        String toCSVString();
        Student fromCSVString (String str);
}
//1) �������� ���������
//public interface CSVConverter{
//public String toCSVString();
//public Student fromCSVString (String str);
//}
//����� ������� ������ ������������� ���� ���������. ������ ���������� ��������� � ��
//������ �������� ������� ������ � ��� CSV �������������� � �������� �� ������ ���� ������
//������� ��������.