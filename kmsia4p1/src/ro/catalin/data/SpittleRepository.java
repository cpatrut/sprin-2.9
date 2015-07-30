package ro.catalin.data;
import java.util.List;

import ro.catalin.Spittle;


public interface SpittleRepository {
List<Spittle> findSpittles(long max, int count);
}